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

public class FactorialRecursion {
    public static int factorial(int x){
        if(x==1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }      
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num=in.nextInt();
        System.out.println(num+"!:" + factorial(num));
    }
    
}
