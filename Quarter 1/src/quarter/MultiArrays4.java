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

public class MultiArrays4 {
    public static int findMax( int a[][]){
        int max=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        return max;
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[][]= new int[4][4];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Row" + (i+1) + " :");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }
        }
        System.out.println("Max: " + findMax(arr));
    }
}
