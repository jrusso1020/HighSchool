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

public class DecimalBinary{
     public static void main(String[] args){
         int counter = 0; double sum = 0;double number2; double sum2 = 0;
         Scanner in = new Scanner(System.in);
         System.out.println("Enter Number:");
         int number = in.nextInt();
         while(number>0){
             number2 = number % 2;
             sum+=(number2 * (Math.pow(10,counter)));
             number=number / 2;
             sum2+=sum; 
             sum-=(number2 * (Math.pow(10,counter)));
             counter++;        
         }
         System.out.print("Your number is equal to " + sum2);
    }
    
}

