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

public class MultiArrays7 {
    public static void coolRow( int a[][]){
        boolean flag=true;
        for(int i=0; i<a.length; i++){
            for( int j=0; j<(a[i].length-1); j++){
                if(a[i][0]==1){
                    if(a[i][j]!=a[i][j+1]){
                        flag=false;
                    }
                }
            }
        }
        System.out.println("Array Has Cool Row: " + flag);
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
        coolRow(arr);
    }
    
}
