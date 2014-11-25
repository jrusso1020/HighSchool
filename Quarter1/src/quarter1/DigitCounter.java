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

public class DigitCounter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = in.nextInt();
        int length = (int)(Math.log10(number) + 1);
        System.out.print("Number of Digits:" + length);
        
        }
}
