/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.Scanner;

public class Competition4A {
    public static void main(String[] args){
        int cnter=0; String ok=""; String no="";
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Numbers to Test: ");
        String line= in.nextLine();
        String arr[]= line.split(" ");
        int num[]= new int[arr.length-1];
        int cnt[]= new int[num.length];
        boolean yes[]= new boolean[num.length];
        for(int i=0; i<arr.length-1; i++){
            String y=arr[i];
            num[i]= Integer.parseInt(y);
        }
        for(int i=0; i<num.length; i++){
            cnter=0;
            for(int j=1; j<=num[i]; j++){
                if(num[i]%j==0){
                    cnter++;
                }
                cnt[i]=cnter;    
            }
            for(int n=1; n<=num[i]; n++){
                if(cnt[i]==n && num[i]%n==0){
                    yes[i]=true;
                    break;
                }
                else{
                    yes[i]=false;
                }
            }
        }
        for(int i=0; i<num.length; i++){
            if(yes[i]==true){
               ok+=" " + num[i]; 
            }
            else{
                no+= " "+num[i];
            }
        }
        System.out.println("Choice Numbers:" + ok);
        System.out.println("Non-Choice Numbers:" + no);
    }
    
}
