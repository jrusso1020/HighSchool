package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
        double price[] = new double[10]; double sum=0;
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$##.##");
        for(int i=0; i<10; i++){
            System.out.println("Enter Price " + (i+1) + " :");
            price[i] = in.nextDouble();
        }
        for( int i=0; i<10; i++)
            System.out.println("Price " + (i+1) + " : " + price[i]);
        for(int i=0; i<10; i++)
            sum+=price[i];
        System.out.println("Sum: " + df.format(sum));
        System.out.println("Average: " + df.format((sum/10)));
    }
    
    
}

