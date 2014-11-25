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

public class InsertionSort2 {
    public static String[] insertionSort2(String a[]){
        int i,j,k;
        for(i=1; i<a.length; i++){
            String current=a[i];
            j=0;
            while(a[j].compareTo(current)>0){
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
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Line of String: ");
        String line= in.nextLine();
        String arr[]=line.split(" ");
        
        System.out.println("Original Array: ");
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        String datnew[]=insertionSort2(arr);
        System.out.println("");
        System.out.println("Sorted Array: ");
        for(int i=0; i<datnew.length; i++){
            System.out.print(datnew[i] + " ");
        }
    }
}
