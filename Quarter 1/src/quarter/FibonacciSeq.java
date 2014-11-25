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

public class FibonacciSeq {
    public static void main(String[] args){
        int count; int num1=1; int num2=1; int num3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        if (num==1){
            System.out.print("1");
        }
        else if(num==2){
            System.out.print("1");
            System.out.print("1");
        }
        else{
            System.out.print("1");
            System.out.print("1");
            for(count=1;count<=(num-2);count++){
                num3= num1+num2;
                System.out.print(num3);
                num1=num2;
                num2=num3;
        }
        }
    }
}
