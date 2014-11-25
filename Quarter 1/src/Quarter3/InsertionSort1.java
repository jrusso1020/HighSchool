/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
public class InsertionSort1 {
    public static int[] insertionSort1(int a[]){
        int i,j,k;
        for(i=1; i<a.length; i++){
            int current=a[i];
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
        int arr[]={29,1,4,5,7,90,23,12,43,54,25};
        System.out.println("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int datnew[]=insertionSort1(arr);
        System.out.println("");
        System.out.println("Sorted Array: ");
        for(int i=0; i<datnew.length; i++){
            System.out.print(datnew[i] + " ");
        }
    }
}
