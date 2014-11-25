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
public class HelloProgram 
{public static void main(String[] args)
    {Scanner in = new Scanner(System.in);
    System.out.println("Enter Gender:");
    String gender = in.nextLine();
    System.out.println("Enter Full Name:");
    String name = in.nextLine();
    System.out.println("Enter Age:");
    int age = in.nextInt();
    System.out.println("Enter Height in Inches:");
    int height = in.nextInt();
    if (gender.equalsIgnoreCase("male")){
        System.out.println("Hello Mr. " + name + "!" + " You are " + age + " years old and " + height + " inches tall!");
        }
    else System.out.println("Hello Ms. " + name + "!" + " You are " + age + " years old and " + height + " inches tall!");{
        }  
    }
}  
