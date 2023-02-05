
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.math.BigInteger;
import  java.util.*;


//pnnepelqomhhheollvlo
public class Solution{
     static FR scan = new FR();

     public static void main(String[] args) {
         int t = 1;
//         t = scan.nextInt();
         int i=1;
         while (i<=t ) {
             solve();
             i++;
         }

     }

     static void solve() {
            int N=scan.nextInt();
          long arr[]=readarr(N);
          long min= Long.MAX_VALUE,max=Long.MIN_VALUE;
          for(int i=0;i<N;i++){
              if(arr[i]<min){
                  min=arr[i];
              }
              if(arr[i]>max){
                  max=arr[i];
              }
          }
if(N==2){
    System.out.println(Math.abs(max-min)+" "+1);
    return;
}
          long minCount=0,maxCount=0;
         BigInteger minC=new BigInteger("0");
         BigInteger maxC=new BigInteger("0");

         for(int i=0;i<N;i++){
              if(arr[i]==min){minC= minC.add(BigInteger.valueOf(1));}
              if(arr[i]==max){maxC= maxC.add(BigInteger.valueOf(1));}

          }
if(minC.compareTo(maxC)==0 && max==min){
    System.out.println(Math.abs(max-min)+" "+minC.pow(2));
    return;
}
//        long temp=Math.min(minCount,maxCount);
      BigInteger tempp=minC.min(maxC);
         System.out.println(Math.abs(max-min)+" "+ (tempp.compareTo(BigInteger.ONE)!=0?tempp.multiply(minC.max(maxC)):tempp));

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

 }
     class FR {
         BufferedReader br;
         StringTokenizer st;

         public FR() {
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
//
//         int N=scan.nextInt();
//         long S[]=new long[N];
//         long T[]=new long[N];
//         for(int i=0;i<N;i++){
//        S[i]=scan.nextLong();
//        }
//        for(int i=0;i<N;i++){
//        T[i]=scan.nextLong();
//        }
//        System.out.println(T[0]);
//        for(int i=1;i<N;i++){
//        min(T[i],S[i-1]+T[i-1]);
//        }
//
