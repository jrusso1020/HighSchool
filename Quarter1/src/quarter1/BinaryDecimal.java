package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valued User
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class BinaryDecimal {
    public static void main(String[] args){
         int counter = 0; double sum = 0;double binary2; double sum2 = 0;
         Scanner in = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("###.##");
         System.out.println("Enter Binary Number:");
         int binary = in.nextInt();
         while(binary>0){
             binary2 = binary % 10;
             sum+=(binary2 * (Math.pow(2,counter)));
             binary=binary / 10;
             sum2+=sum; 
             sum-=(binary2 * (Math.pow(2,counter)));
             counter++;        
         }
         System.out.print("Your number is equal to " + sum2);
    }
    
}
