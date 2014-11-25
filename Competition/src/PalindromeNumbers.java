/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args){
        int foward=0; int backward=0; int j; int ans=0;
        ArrayList<Integer> fow= new ArrayList<Integer>();
        ArrayList<Integer> back= new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Input:");
        String line= in.nextLine();
        String arr[]= line.split(", ");
        String x= arr[1];
        int base= Integer.parseInt(x, 10);
        String y= arr[0];
        int num= Integer.parseInt(y, base);
        if(base!=10){
            String k= Integer.toString(num);
            num=Integer.parseInt(k,10);
            while(num>0){               
                fow.add(num%10);
                num/=10;
            }
            for(int i=(fow.size()-1); i>=0; i--){
                back.add(fow.get(i));
                }
            for(j=0; j<10; j++){
                foward=0;
                backward=0;
                for(int i=0; i<fow.size(); i++){
                    foward+=(fow.get(i)+back.get(i))* Math.pow(10,i);
                }
                int temp=foward;
                for(int i=(fow.size()-1); i>=0; i--){                    
                    backward+=(temp%10)* Math.pow(10, i);
                    temp/=10;
                }
                System.out.println(foward + " " + backward);
                y=Integer.toString(foward);
                x=Integer.toString(backward);
                foward=Integer.parseInt(y, base);
                backward=Integer.parseInt(x, base);
                if(foward==backward){
                    break;
                }
                fow.clear();
                back.clear();
                ans=foward;
                String p=Integer.toString(foward);
                foward=Integer.parseInt(p, 10);
                while(foward>0){
                    fow.add(foward%10);
                    foward/=10;
                }
                for(int i=(fow.size()-1); i>=0; i--){
                    back.add(fow.get(i));
                }
            }
        }
        else{
             while(num>0){
                fow.add(num%10);
                num/=10;
            }
            for(int i=(fow.size()-1); i>=0; i--){
                back.add(fow.get(i));
                }
            for(j=0; j<10; j++){
                foward=0;
                backward=0;
                for(int i=0; i<fow.size(); i++){
                    foward+=(fow.get(i)+back.get(i))* Math.pow(10,i);
                }
                int temp=foward;
                for(int i=(fow.size()-1); i>=0; i--){                    
                    backward+=(temp%10)* Math.pow(10, i);
                    temp/=10;
                }
                if(foward==backward){
                    break;
                }
                fow.clear();
                back.clear();
                ans=foward;
                while(foward>0){
                    fow.add(foward%10);
                    foward/=10;
                }
                for(int i=(fow.size()-1); i>=0; i--){
                    back.add(fow.get(i));
                }
            }
        }
        if(j==10){
            System.out.println("Outpute: None," +ans);
        }
        else{
            System.out.println("Output: " + foward);
        }
    }
    
}

