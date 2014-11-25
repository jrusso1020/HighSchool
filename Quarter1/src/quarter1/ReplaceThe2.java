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

public class ReplaceThe2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String sent2;
        do{
        System.out.println("Enter a sentence that uses the:");
        sent2 = in.nextLine();
        String sent = sent2;
        int the = sent.indexOf("the");
        while(the!=-1){
            sent = sent.substring(0,the) + "a" + sent.substring(the + "the".length());
            the = sent.indexOf("the");
        }
        System.out.println(sent);
    }
        while(!sent2.equalsIgnoreCase("stop") && !sent2.equalsIgnoreCase("quit"));
        System.out.println("TERMINATING");
        }
}

