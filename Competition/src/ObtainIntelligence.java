/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.Scanner;
public class ObtainIntelligence {
    public static void main(String[] args){
        int cnt=0;
        Scanner in= new Scanner(System.in);
        int x= in.nextInt(); // takes in number of throws
        in.nextLine();
        int arr[]= new int[x*2];
        String num[]= new String[2];
        for(int i=0; i<x; i++){
            String line= in.nextLine();
            num= line.split(" ");
            arr[cnt]=Integer.parseInt(num[0]);
            cnt++;
            arr[cnt]=Integer.parseInt(num[1]);
            cnt++;
        }
        for(int i=0; i<arr.length-1; i+=2){
            if(arr[i]==arr[i+1]){
                System.out.println("The Old Knife-Hits-the-Target Trick");
            }
            else{
                System.out.println("Missed it by THAT much");
            }
        }
    }
}
