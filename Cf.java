import java.util.*;


public class Cf{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int t=1;
         t=scan.nextInt();
        while(t-->0){
            solve();
        }
    }
    static void  solve() {
    long x=scan.nextLong();
        long y=scan.nextLong();
        long n=scan.nextLong();
    long diff=n%x;
    n-=diff;
    n-=x;
    n+=y;
        System.out.println(n);
    
    }
}


