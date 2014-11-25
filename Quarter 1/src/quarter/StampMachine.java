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
import java.text.DecimalFormat;

public class StampMachine {
    public static void main(String[] args){
        double firstStamp; double stamp2;
        DecimalFormat df = new DecimalFormat("$##.##");
        Scanner in = new Scanner(System.in);
            System.out.print("Enter Dollar Amount:");
            int money = in.nextInt();
            in.nextLine();
            firstStamp = (int) (money/.47);
            stamp2 = (int) ((money - (firstStamp * .47)) * 100);
            System.out.print("First Class Stamps:" + firstStamp + ": 1 Cent Stamps:" + stamp2);
        }   
}
