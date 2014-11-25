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

public class DigitReader {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = in.nextInt();
        int number1 = number % 10;
        
        while(number > 10){
            number = number / 10;
            
        }
        System.out.print("Last Digit: " + number1 + " First Digit: " + number);
    }
    
}

