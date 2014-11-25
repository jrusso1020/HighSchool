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

public class ArrayReverse {
    public static void reverse(int a[]){
        int r[] = new int[a.length];
        for(int y=0; y<a.length; y++)
            r[y]=a[a.length-1-y];
        System.out.println("Reversed");
        for(int n=0; n<r.length; n++)
        System.out.println((n + "\t" + r[n]));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length of array:");
        int x = in.nextInt();
        int arr[] = new int[x];
        for(int i =0; i<x; i++){
            System.out.println("Enter " + i + " Digit of array:");
            arr[i] = in.nextInt();
        }
        reverse(arr);
        
    }
    
}
