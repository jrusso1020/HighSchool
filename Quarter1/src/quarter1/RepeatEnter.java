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

public class RepeatEnter {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Charater A,B, or C; Enter Q to end:");
        String letter = in.nextLine();
        while(letter.equalsIgnoreCase("A") || letter.equalsIgnoreCase("B") || letter.equalsIgnoreCase("C")){   
            System.out.println("Good Job!");
            System.out.println("Enter Charater A,B, or C; Enter Q to end:");
            letter = in.nextLine(); 
        }
        
    }
    
}

