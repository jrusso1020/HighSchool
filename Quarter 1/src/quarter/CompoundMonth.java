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

public class CompoundMonth {
    public static void main(String[] args){
        double amount = 0; int count = 0; double rate = .05;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principle Amount:");
        int principle = in.nextInt();
        amount+=principle;
        while(amount<50000){
            count++;
            amount=principle*Math.pow(1 + rate, count);          
        }
        System.out.println("It will take " + count + " months to acquire enough interest");
    }
}

