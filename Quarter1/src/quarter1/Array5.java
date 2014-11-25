package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Prices:");
        int x = in.nextInt();
        double price[] = new double[x];
        for(int i=0; i<x; i++){
            System.out.println("Enter Price " + (i+1) + " :");
            price[i] = in.nextDouble();
        }
        int index=0;
        for(int i=0; i<x; i++){
            if(price[i]<price[index])
                index=i;
        }
        System.out.println("Min is " + price[index] + " at index " + index );
    }
    
}

