

import java.util.Arrays;
import java.util.Scanner;

class cf_replace_element{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        int t=1;
//         t=scan.nextInt();
        while(t-->0){
        solve();
        }
    }
    static void  solve(){
        int N=scan.nextInt();
        String S=scan.next();
        int ans=0;
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)==S.charAt(i-1)){
                ans++;
            }
        }
        System.out.println(ans);


    }


}