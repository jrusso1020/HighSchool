package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;
public class ArrayRun {
    public static void run(int a[]){
        int y=0; int cnt;  int index=0;
        for(int i =0; i<a.length; i++){
            cnt=1;
            for(int j= 1; j<(a.length-1);j++){
                if(a[i]==a[j])
                    cnt++;
            }
            if(cnt>y){
                y=cnt;
                index=i;
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("Index of Longest Run: " + index);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of Array:");
        int x = in.nextInt();
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            System.out.println("Enter " + (i+1) + " Digit:");
            arr[i]=in.nextInt();
        }
        run(arr);
        
    }
    
}
