

import java.util.Scanner;

class lcm{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
//        int t=scan.nextInt();
//        while(t-->0){
            solve();
//        }
    }
    static void  solve(){
       long H=scan.nextLong();
        long W=scan.nextLong();
        if(H==1|| W==1){
            System.out.println(1);
        }else{
            System.out.println((long)(Math.ceil((long)H*W/2)));
        }

    }



}

//    int N=scan.nextInt();
//        if(N!=2) {
//                int res[] = new int[N];
//                Arrays.fill(res, -10);
//                int ans[]=new int[N];
//                for (int i = 0; i < N - 1; i++) {
//        for (int j = i + 1; j < N; j++) {
//        if (res[i] == res[j]) {
//        if(res[i]==-10 && res[j]==-10){
//        System.out.print(1+" ");
//        ans[i]=3;
//        ans[j]=0;
//        }else{
//        System.out.print(0 + " ");
//        res[i]++;
//        res[j]++;
//        }
//
//        } else if (res[i] > res[j]) {
//        System.out.print(-1 + " ");
//        res[j]=0;
//        res[j]+=3;
//        } else {
//        System.out.print(1 + " ");
//        res[i]=0;
//        res[i]+=3;
//        }
//        }
//        }
//        System.out.println();
//        }else{
//        System.out.println(0);
//        }
//        System.out.println();