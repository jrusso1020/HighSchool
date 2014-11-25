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
public class HelloWorld 
{
    public static void main(String[] args)  
        {Scanner in = new Scanner(System.in);
        System.out.print("Enter Name:");
        String name = in.nextLine();
        System.out.print("Enter Age:");
        int age = in.nextInt();
            System.out.println("Hello World I am " + name + " and I am " + age + " years old");
        }
}
