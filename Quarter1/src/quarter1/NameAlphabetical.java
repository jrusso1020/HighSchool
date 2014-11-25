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
public class NameAlphabetical 
{public static void main(String[] args)
    {Scanner in = new Scanner(System.in);
    System.out.println("Enter Name 1:");
    String name1 = in.nextLine();
    System.out.println("Enter Name 2:");
    String name2 = in.nextLine();
    if (name1.compareTo(name2) < 0)
        System.out.println("Comparison result: " + name1 + " comes before " + name2);
    else if (name1.compareTo(name2) == 0)
        System.out.println("Comparison result: " + name1 + " is equal to " + name2);
    else if (name1.compareTo(name2) > 0)
        System.out.println("Comparison result: " + name2 + " comes before " + name1);
    }    
}
