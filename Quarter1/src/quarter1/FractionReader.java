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
public class FractionReader 
{public static void main(String[] args)
    {int sum1, lcd;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter Numerator of Fraction 1:");
    int numerator1 = in.nextInt();
    System.out.print("Enter Numerator of Fraction 2:");
    int numerator2 = in.nextInt();
    System.out.print("Enter Denominator of Fraction 1:");
    int denominator1 = in.nextInt();
    System.out.print("Enter Denominator of Fraction 2:");
    int denominator2 = in.nextInt();
    lcd = denominator1 * denominator2;
    sum1 = (denominator2 * numerator1) + (denominator1 * numerator2);        
    System.out.printf("Sum: " + sum1 + "/" + lcd);
    }
}

