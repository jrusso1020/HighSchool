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

public class AccessGranted {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String pass;
        do{
            System.out.println("Enter Password:");
            pass = in.nextLine();
        }
        while(!pass.equalsIgnoreCase("swag"));
        System.out.println("ACCESS GRANTED");
     
    
    }
    
}
