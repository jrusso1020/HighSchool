/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
import java.util.*;
public class InsertionSort4 {
    public static double[] insertionSort4(double a[]){
        int i,j,k;
        for(i=1; i<a.length; i++){
            double current=a[i];
            j=0;
            while(a[j]<current){
                j++;
                }
            for(k=i; k>j; k--){
                    a[k]=a[k-1];
            }
            a[j]=current;
        }
        return a;
    }
    public static void main(String[] args){
        double arr[]={6.7,.95,78.9,45.3,23.5,334.56,2321,.89,.154};
        System.out.println("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        double n[]=insertionSort4(arr);
        System.out.println("Sorted Array:");
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+ " ");
        } 
    }
}
