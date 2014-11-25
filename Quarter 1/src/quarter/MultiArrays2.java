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

public class MultiArrays2 {
    public static void sum(int a[][]){
        int sum[]= new int[a.length];
        for(int j=0; j<a.length; j++){
            for(int i=0; i<a[0].length; i++){
                sum[j]+= a[j][i];
            }
        }
        System.out.println("Index\tValue");
        for(int x=0; x<sum.length; x++){
            System.out.println(x + "\t" + sum[x]);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int row= in.nextInt();
        System.out.println("Enter Number of Columns:");
        int col= in.nextInt();
        int arr[][]= new int[row][col];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Row" +(i+1) + ":");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }
        }
        sum(arr);
        }
    }

