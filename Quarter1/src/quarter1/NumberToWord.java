package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args){
        int cnt=0; String line="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Numbers: ");
        int length= in.nextInt();
        int num[]= new int[length];
        String word[]= new String[length];
        System.out.println("Enter Numbers: ");
        for(int i =0; i<length; i++){
            num[i]= in.nextInt();
        }
        for(int i=0; i<length; i++){
            int n=num[i];
            if(n==0 ){
                    line= " zero" + line;
            }
            else{
                while(n>0){
                int rem=n%10;
                
                if(rem==1 && (cnt==0 && ((n/10)%10!=1))){
                    line= "one" + line;
                }
                else if(rem==2 && (cnt==0 && ((n/10)%10!=1))){
                    line= "two" + line;
                }
                else if(rem==3 && (cnt==0 && ((n/10)%10!=1))){
                    line= "three" + line;
                }
                else if(rem==4 && (cnt==0 && ((n/10)%10!=1))){
                    line= "four" + line;
                }
                else if(rem==5 && (cnt==0 && ((n/10)%10!=1))){
                    line= "five" + line;
                }
                else if(rem==6 && (cnt==0 && ((n/10)%10!=1))){
                    line= "six" + line;
                }
                else if(rem==7 && (cnt==0 && ((n/10)%10!=1))){
                    line= "seven" + line;
                }
                else if(rem==8 && (cnt==0 && ((n/10)%10!=1))){
                    line= "eight" + line;
                }
                else if(rem==9 && (cnt==0 && ((n/10)%10!=1))){
                    line= "nine" + line;
                }
                else if(rem==1 && num[i]%10==0 && cnt==1){
                    line= "ten" + line;
                }
                else if(rem==1 && num[i]%10==1 && cnt==1){
                    line= "eleven" + line;
                }
                else if(rem==1 && num[i]%10==2 && cnt==1){
                    line= "twelve" + line;
                }
                else if(rem==1 && num[i]%10==3 && cnt==1){
                    line= "thirteen" + line;
                }
                else if(rem==1 && num[i]%10==4 && cnt==1){
                    line= "fourteen" + line;
                }
                else if(rem==1 && num[i]%10==5 && cnt==1){
                    line= "fifteen" + line;
                }
                else if(rem==1 && num[i]%10==6 && cnt==1){
                    line= "sixteen" + line;
                }
                else if(rem==1 && num[i]%10==7 && cnt==1){
                    line= "seventeen" + line;
                }
                else if(rem==1 && num[i]%10==8 && cnt==1){
                    line= "eighteen" + line;
                }
                else if(rem==1 && num[i]%10==9 && cnt==1){
                    line= "nineteen" + line;
                }
                else if(rem==2 && cnt==1){
                    line= "twenty" + line;
                }
                else if(rem==3 && cnt==1){
                    line= "thirty" + line;
                }
                else if(rem==4 && cnt==1){
                    line= "fourty" + line;
                }
                else if(rem==5 && cnt==1){
                    line= "fifty" + line;
                }
                else if(rem==6 && cnt==1){
                    line= "sixty" + line;
                }
                else if(rem==7 && cnt==1){
                    line= "seventy" + line;
                }
                else if(rem==8 && cnt==1){
                    line= "eighty" + line;
                }
                else if(rem==9 && cnt==1){
                    line= "ninety" + line;
                }
                else if(cnt==2 && rem==1){
                    line= "one hundred"+ line;
                }
                else if(cnt==2 && rem==2){
                    line= "two hundred"+ line;
                }
                else if(cnt==2 && rem==3){
                    line= "three hundred"+ line;
                }
                else if(cnt==2 && rem==4){
                    line= "four hundred"+ line;
                }
                else if(cnt==2 && rem==5){
                    line= "five hundred"+ line;
                }
                else if(cnt==2 && rem==6){
                    line= "six hundred"+ line;
                }
                else if(cnt==2 && rem==7){
                    line= "seven hundred"+ line;
                }
                else if(cnt==2 && rem==8){
                    line= "nine hundred"+ line;
                }
                else if(cnt==2 && rem==9){
                    line= "nine hundred"+ line;
                }
                n=n/10;
                cnt++;
                line= " " + line;
            }
        }
            word[i]=line;
            line="";
            cnt=0;
        }
        for(int i=0; i<length; i++){
            System.out.println(num[i] + ":"+ word[i]);
        }
        
    } 
    
}
