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

public class CallParrot {
    public static void parrot(){
        System.out.println("Have a nice day!");
        System.out.println("Have a nice day!");
        System.out.println("Have a nice day!");
    }
    
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Continue to Continue or Quit to end:");
    String input = in.nextLine();
    while(input.equalsIgnoreCase("continue")){
        parrot();
        System.out.println("Enter Continue to Continue or Quit to end:");
        input = in.nextLine();
    }
        System.out.println("TERMINATING");
}
    
}
