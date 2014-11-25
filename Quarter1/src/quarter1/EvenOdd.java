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

public class EvenOdd {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter a number greater than 10:");
        int number = in.nextInt();
        if (number%2==0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
        in.nextLine();
        if(number%3==0 && number%5==0){
            System.out.println(number + " is divisible by both 3 and 5");
        }
        else if(number%3==0){
            System.out.println(number + " is divisible by 3");
        }
        else if(number%5==0){
            System.out.println(number + " is divisible by 5");
        }
        else{
            System.out.println(number + " is not divisible by 3 or 5");
        }
        
        }
}
