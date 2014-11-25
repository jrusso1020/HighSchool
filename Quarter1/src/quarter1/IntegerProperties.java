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

public class IntegerProperties {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = in.nextInt();
    
    if(number%2==0){
        System.out.println(number + " is even");
    }
    else{
        System.out.println(number + " is odd");
    }
    in.nextLine();
    if(number%5==0){
        System.out.println(number + " is divisible by 5");
    }
    else{
        System.out.println(number + " is not divislbe by 5");
    }
    
    if(((23+Math.sqrt(Math.pow(23,2)-(4*22)))/2)==number || ((23-Math.sqrt(Math.pow(23,2)-(4*22)))/2)==number){
        System.out.println("Root");
                
    }
    else{
        System.out.println("Not a root");
    }
    
    }   
}
