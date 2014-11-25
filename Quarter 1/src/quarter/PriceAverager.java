package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class PriceAverager 
{public static void main(String[] args)
    {double sum;
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("$###.##");
        System.out.print("Enter Price 1:");
        double price1 = in.nextDouble();
        System.out.print("Enter Price 2:");
        double price2 = in.nextDouble();
        System.out.print("Enter Price 3:");
        double price3 = in.nextDouble();
        sum = (price1 + price2 + price3)/ 3;
        System.out.printf("Average:" + df.format(sum));
    }
    
}
