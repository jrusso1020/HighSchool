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

public class YesNo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String response= in.nextLine();
        if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y") || response.equalsIgnoreCase("ok") || response.equalsIgnoreCase("sure") || response.equalsIgnoreCase("why not")){
            System.out.println("OK");
        }
        else if(response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no thanks")){
            System.out.println("TERMINATING");
        }
        else{
            System.out.println("Bad input");
        }
    }
           
    
}



