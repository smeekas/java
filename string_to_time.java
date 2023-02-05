import java.util.Scanner;

public class string_to_time {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String times[]=new String[n];
        for(int i=0;i<n;i++){
            times[i]=scan.next();
        }
        int hours = 0,minute=0,second=0;
        for(int i=0;i<n;i++){
//            String t[]=times[i].split(":");
            hours+=Integer.parseInt(times[i].substring(0,2));
            minute+=Integer.parseInt(times[i].substring(2,4));
            second+=Integer.parseInt(times[i].substring(4,6));

        }
        if(second>=60){
            minute+=second/60;
            second%=60;
        }
        if(minute>=60){
            hours+=minute/60;
            minute%=60;
        }
        System.out.println(hours+":"+minute+":"+second);


    }
}
