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

public class Array2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[]= new int[8];
        for(int i=0; i<8; i++){
            System.out.println("Enter Number" + (i+1) + ":");
            a[i]= in.nextInt();
        }
        for(int x=0; x<8; x++)
            System.out.println((x+1) + ": " + a[x]);
           
        
    }
}
