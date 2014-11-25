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

public class MultiArrays6 {
    public static void sort(int a[][]){
        int n=0; int y=0;
        int b[]= new int[a.length *a[0].length];
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    b[n]=a[i][j];
                    n++;
                }
            }
            for(int i=0; i<(b.length-1); i++){
                for(int j= (i+1); j<b.length; j++){
                    if(b[i]>b[j]){
                        int temp =b[i];
                        b[i] =b[j];
                        b[j] =temp;
                    }
                }
            }
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    a[i][j]=b[y];
                    y++;
                }
            }
        System.out.println();
        System.out.println("NEW ARRAY SORTED:");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int x= in.nextInt();
        System.out.println("Enter Number of Columns:");
        int y= in.nextInt();
        int arr[][]= new int[x][y];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Row" + (i+1) + " :");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        sort(arr);
    }
    
}
