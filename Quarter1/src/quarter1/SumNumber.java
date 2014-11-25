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

public class SumNumber {
    public static void main(String[] args){
        int count; int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = in.nextInt();
        for(count=1;count<number;count++){
            sum+=count;
        }
        sum+=number;
        System.out.println("Sum:" + sum);
        
    }
    
}
