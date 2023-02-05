import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
// a2Oj problem no-17 ==> Hungry Sequence
 public  class Snuke {
       static FRR scan=new FRR();
    public static void main(String[] args) {
        int i=1;
//        i=scan.nextInt();
        while (i-- > 0) {
                solve();

        }
    }
    public static void solve(){
    int N=scan.nextInt();
        int first[]=new int[N];

        int second[]=new int[N];
            char []str=scan.next().toCharArray();

        for(int i=0;i<N;i++){
            first[i]= scan.nextInt();

        }
        printarr(first);

        for(int k=0;k<N;k++){
            second[k]= scan.nextInt();

        }
        Arrays.sort(first);
        Arrays.sort(second);
        printarr(first);
        printarr(second);
        int i=N-1,j=N-
                1;
        while(i>=0 && j>=0){
                if(first[j]>second[j]){
                    i--;j--;
                }
                else{
                    System.out.println("NO");
                    return;
                }
        }
        System.out.println("YES");
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printarr(char arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printarr(long arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static long[] readarr(int N){
//         int N=scan.nextInt();
        long []arr=new long[N];
        for(int i=0;i<N;i++){
            arr[i]=scan.nextLong();
        }
        return arr;
    }
    public static double[] readarrf(){
        int N=scan.nextInt();
        double []arr=new double[N];
        for(int i=0;i<N;i++){
            arr[i]=scan.nextDouble();
        }
        return arr;
    }
    public static double minOfArr(long arr[]){
        double min=1000000000;
        for(int i=0;i<arr.length;i++){
            min=Math.min((double)arr[i],min);
        }
        return  min;
    }
}
class FRR {
    BufferedReader br;
    StringTokenizer st;

    public FRR() {
        br = new BufferedReader(
                new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
