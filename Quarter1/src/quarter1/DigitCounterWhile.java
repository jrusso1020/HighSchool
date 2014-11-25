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

public class DigitCounterWhile {
    public static void main(String[] args){
        int cnt = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        int number = in.nextInt();
        while(number > 0){
            number = number / 10;
            cnt++;
           }
        System.out.print("Number of digits:" + cnt);
    }
    
}

