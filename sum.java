import java.util.Scanner;

public class sum {
    static int X;
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
         X=scan.nextInt();
        int Y=scan.nextInt();
        System.out.println(solve(Y));

    }

    static int solve(int y){
//        if(y>X){
//            return 8888;
//        }
        if(X==y){
            return 0;
        }else if(y%2==0){
            return 1+solve(y/2);
        }else{
            return 1+solve(y--);
        }
    }

}
