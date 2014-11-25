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

public class CoinWhile {
    public static void main(String[] args){
    int dollars; int quarters; int dimes; int nickels; int pennys;
        final int dollarValue = 100;
        final int quarterValue = 25; 
        final int dimeValue = 10;
        final int nickelValue = 5;
        final int pennyValue = 1;
        
            
            Scanner in = new Scanner(System.in);
            System.out.print("Enter Cent Amount; Enter -1 to end:");
            double cents = in.nextDouble();
            while(cents!=-1){
            double dollars2 = cents/dollarValue;
            dollars = (int) dollars2;
            double quarter2 = (cents - (dollars *dollarValue))/quarterValue;
            quarters = (int) quarter2;
            double dimes2 = (cents - (dollars *dollarValue) - (quarters * quarterValue))/dimeValue;
            dimes = (int) dimes2;
            double nickels2 = (cents - (dollars *dollarValue) - (quarters * quarterValue)- (dimes * dimeValue))/nickelValue;
            nickels = (int) nickels2;
            double pennys2 = (cents - (dollars *dollarValue) - (quarters * quarterValue) - (dimes *dimeValue)- (nickels * nickelValue))/pennyValue;
            pennys = (int) pennys2;
            System.out.println("Dollars:" + dollars + " Quarters:" + quarters + " Dimes:" + dimes + " Nickels:" + nickels + " Pennies:" + pennys);
            System.out.println("Enter Cent Amount; Enter -1 to end:");
            cents = in.nextDouble();
                
            }
    }
    
}

