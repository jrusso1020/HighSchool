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

public class FibonacciRecursive {
    public static int fibonacci(int x){
        if (x<=1) 
            return x;
        else return fibonacci(x-1)+ fibonacci(x-2);
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Finbonacci Digits:");
        int num = in.nextInt();
        System.out.println("The " + num + " Digit = " + fibonacci(num));
    }
}
