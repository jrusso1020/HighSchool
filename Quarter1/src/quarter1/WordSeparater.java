package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.util.Scanner;

public class WordSeparater {
    public static void separate(String x){
        System.out.println(x);
        int n = x.indexOf(" ");
        if(n>=0){
        x = x.substring(n+1);
        separate(x);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String str = in.nextLine();
        separate(str);
    }          
    
}

