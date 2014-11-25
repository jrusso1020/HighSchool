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

public class NotebookTax {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("$###.##");
        double sum; double tax;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Notebooks bought:");
        int notebooks = in.nextInt();
        System.out.println("Enter the Price of one Notebook:");
        double price = in.nextDouble();
        in.nextLine();
        System.out.println("Enter Career:");
        String career = in.nextLine();
        sum = (notebooks * price) * 1.06;
        tax = (notebooks * price) * .06;
        System.out.println(career + ":" + df.format(tax) + ":total:" + df.format(sum));
    }
}
