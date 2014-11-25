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

public class MultiArrays3 {
    public static void main(String[] args){
        int sum=0; double avg=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int x= in.nextInt();
        System.out.println("Enter number of columns:");
        int y= in.nextInt();
        int arr[][]= new int[x][y];
        for(int i =0; i<arr.length; i++){
            System.out.println("Enter Row" + (i+1) + " :");
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print("     ");
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Aver:");
        for(int j=0; j<arr[0].length; j++){
            sum=0;
            avg=0;
            for(int i=0; i<arr.length; i++){
                sum+=arr[i][j];
            }
            avg=sum/arr[0].length;
            System.out.print(avg+ "\t");
        }
    }
    
}
