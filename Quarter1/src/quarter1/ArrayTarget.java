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

public class ArrayTarget {
    public static void target(int a[], int x){
        boolean flag = false;
        for(int i = 0; i<a.length; i++){
            if(a[i]==x)
                flag=true;
        }
        System.out.println("Target is in array: " + flag);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Integers for array:");
        int x = in.nextInt();
        int arr[] = new int[x];
        for(int i=0; i<x; i++){
            System.out.println("Enter " + (i+1) + " Digit:");
            arr[i] = in.nextInt();
        }
        System.out.println("Enter Target Value:");
        int tar = in.nextInt();
        target(arr, tar);
    }
    
}
