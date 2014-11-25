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

public class ReplaceThe {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence that uses the:");
        String sent = in.nextLine();
        int the = sent.indexOf("the");
        while(the!=-1){
            sent = sent.substring(0,the) + "a" + sent.substring(the + "the".length());
            the = sent.indexOf("the");
        }
        System.out.println(sent);
    }    
}
