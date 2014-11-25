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

public class CoinCounter {
    public static void main(String[] args){
        int quarters; int dimes; int nickels; int pennys;
        final int quarterValue = 25; 
        final int dimeValue = 10;
        final int nickelValue = 5;
        final int pennyValue = 1;
            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Cent Amount:");
            double cents = in.nextDouble();
            double quarter2 = cents/quarterValue;
            quarters = (int) quarter2;
            double dimes2 = (cents - (quarters * quarterValue))/dimeValue;
            dimes = (int) dimes2;
            double nickels2 = (cents - (quarters * quarterValue)- (dimes * dimeValue))/nickelValue;
            nickels = (int) nickels2;
            double pennys2 = (cents - (quarters * quarterValue) - (dimes *dimeValue)- (nickels * nickelValue))/pennyValue;
            pennys = (int) pennys2;
            System.out.println("Quarters:" + quarters + " Dimes:" + dimes + " Nickels:" + nickels + " Pennies:" + pennys);
                  }
}


