
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class J03024_so_uu_the {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            int check=1;
            if(s.charAt(0)=='0') check=0;
            int check1=1;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)<'0'||s.charAt(i)>'9'){
                    check1=0;
                    break;
                }
            }
            if(check==0||check1==0) System.out.println("INVALID");
            else{
                int demchan=0, demle=0;
                //int check2=0;
                for(int i=0;i<s.length();i++){
                    if((s.charAt(i)-'0')%2==0) demchan++;
                    else demle++;
                }
                if(demchan==demle){
                    System.out.println("NO");
                }
                else{
                    if(s.length()%2==0){
                        if(demchan>demle){
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                    else{
                        if(demle>demchan){
                            System.out.println("YES");
                        }
                        else{
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}
