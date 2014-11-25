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

public class MultiArrays5 {
    public static void sumDiagonal(int a[][]){
        int d1=0; int d2=0; int i=0; int n=(a.length-1);
            for(int j=0; j<a.length; j++){
                d1+=a[i][j];
                i++;
            }
            for(int j=(a.length-1); j>=0; j--){ 
                d2+=a[n-j][j];
            }
            for(int y=0; y<a.length; y++){
                for(int x=0; x<a[y].length; x++){
                    System.out.print(a[y][x] + "\t");
                }
                System.out.println();
            }
            System.out.println("Sum of Diagonal 1: " + d1);
            System.out.println("Sum of Diagonal 2: " + d2);
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[][]= new int[4][4];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Row" +(i+1) + " :");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }
        }
        sumDiagonal(arr);
    }
    
}
