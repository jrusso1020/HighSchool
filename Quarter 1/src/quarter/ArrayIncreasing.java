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

public class ArrayIncreasing {
    public static void increasing(int a[]){
        for(int i=0; i<(a.length-1); i++)
            for(int j= (i+1); j<a.length; j++){
                if(a[i]>a[j]){
                    int temp =a[i];
                    a[i] =a[j];
                    a[j] =temp;
                }
            }
        System.out.println("Index\tValue");
        for(int i=0; i<a.length; i++)
        System.out.println((i+1) + "\t" + a[i]);
                
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Numbers in Array:");
        int x = in.nextInt();
        int arr[] = new int[x];
        for(int i =0; i<x; i++){
            System.out.println("Enter " + (i+1) + " Number:");
            arr[i]= in.nextInt();
        }
        increasing(arr);    
    }
    
}
