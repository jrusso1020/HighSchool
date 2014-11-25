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
public class NameLength 
{public static void main(String[] args)
    {Scanner in = new Scanner(System.in);
    System.out.print("Enter Name 1:");
    String name1 = in.nextLine();
    System.out.print("Enter Name 2:");
    String name2 = in.nextLine();
    System.out.println("Length of Name 1:" + name1.length()); 
    System.out.println("Length of Name 2:" + name2.length());
    if (name1.equalsIgnoreCase(name2))
        System.out.print("Yes the names are the same");
        else System.out.print("No the names are not the same");
    }
}
