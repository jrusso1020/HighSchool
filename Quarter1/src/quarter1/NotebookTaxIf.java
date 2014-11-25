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
import java.text.DecimalFormat;

public class NotebookTaxIf {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("$###.##");
        double sum=0; double tax=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Notebooks bought:");
        int notebooks = in.nextInt();
        System.out.println("Enter the Price of one Notebook:");
        double price = in.nextDouble();
        in.nextLine();
        System.out.println("Enter Career:");
        String career = in.nextLine();
        if(career.equalsIgnoreCase("student")){
        sum= notebooks * price;
        tax = 0;
        System.out.println(career + ":" + df.format(tax) + ":total:" + df.format(sum));
    }
        else if(career.equalsIgnoreCase("doctor")){
        sum= (notebooks * price) * 1.10;
        tax= (notebooks * price) * .10;
        System.out.println(career + ":" + df.format(tax) + ":total:" + df.format(sum));
        }
        else {
        sum+= (notebooks * price) * 1.06;
        tax+= (notebooks * price) * .06;
        System.out.println(career + ":" + df.format(tax) + ":total:" + df.format(sum));

    }
    }
}
