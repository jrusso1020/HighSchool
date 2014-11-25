/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package competition;

/**
 *
 * @author james.russo
 */
import java.util.Scanner;

public class Competition4B {
    public static boolean check(int b[], int x){
        boolean flag=true; int cnt=0; 
        for(int i=0; i<b.length; i++){
            if(b[i]==x){
                cnt++;
            }
            if(cnt==2){
                return false;
            }
        
        }
        return flag;
    }
    public static void main(String[] args){
        int sum1=0; int sum2=0; int ans=0; int cnt=1; int index=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num= in.nextInt();
        int arr[]= new int[20];
        int numb[]= new int[(int)(Math.log10(num)+1)];
        for(int i=0; i<arr.length; i++){
            sum1=0;
            sum2=0;
            for(int j=0; j<numb.length; j++){
                numb[j]=num%10;
                num/=10;
                
            }
            for(int j=0; j<(numb.length-1); j++){
            for(int n= (j+1); n<numb.length; n++){
                if(numb[j]<numb[n]){
                    int temp =numb[j];
                    numb[j] =numb[n];
                    numb[n] =temp;
                }
            }
            }
            for(int j=0; j<numb.length; j++){
                sum1+=numb[j]*(int)Math.pow(10,(numb.length-1-j));
            }
            for(int j=0; j<numb.length; j++){
                sum2+=numb[j]*(int)Math.pow(10,j);
            }
            ans= sum1-sum2;
            System.out.println(sum1+ "-" + sum2+ "=" + ans);
            arr[i]=ans;           
            if(check(arr, ans)==false){
                break;
            }
            num=ans;
            cnt++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==ans){
                index=i;
                break;
            }
        }
        System.out.println("Length until Repeat: " + cnt);
        int chain=cnt-(index+1);
        System.out.println("Length of Chain: " + chain);
    }
    
}
