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

public class DecimalBinary {
    public static void main(String[] args){
        int number2=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = in.nextInt();
        while(number>0){
            number2+=(number%2);
            number = number/2;
                    
        }
           System.out.println("Your binary number is" + number2); 
        
    }
}
