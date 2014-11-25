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

public class PrimeNum {
    public static void main(String[] args){
        int count; int sum =0; boolean flag = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        double square = Math.sqrt(num);
        for(count=2;count<=square;count++){    
                sum=num%count;
        if (sum==0){
            flag = false;}
        
        }
         System.out.println("Number is prime:" + flag);
    }
    
    
}
