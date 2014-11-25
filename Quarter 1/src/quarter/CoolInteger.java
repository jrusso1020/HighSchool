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

public class CoolInteger {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cnt=0;  int sum = 0; int number1=0; int number2=0;
        System.out.println("Enter a Positive Number:");
        int number = in.nextInt();
        number1+=number;
        number2+=number;
        while(number1 > 0){
            int number3 = number1 % 10;
            sum+=number3;
            number1= number1 /10;
        }
        while(number > 0){
            number = number / 10;
            cnt++;           
           }
        System.out.println(sum);
        if(number2%sum==0){
            System.out.println("This is a cool number");
        }
        else{
            System.out.println("This is not a cool number");
        }
        System.out.print("Number of digits:" + cnt);
    }
    }    
