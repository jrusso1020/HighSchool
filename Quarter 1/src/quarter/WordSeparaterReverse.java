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

public class WordSeparaterReverse {
    public static void separate(String x){
        int n = x.indexOf(" ");
        if(n>=0){
        x = x.substring(n+1);
        separate(x);
        if(x.indexOf(" ")==-1)
            System.out.println(x);
        else
            System.out.println(x.substring(0,x.indexOf(" ")));
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String str = in.nextLine();
        separate(str);
        System.out.println(str.substring(0,str.indexOf(" ")));
    }          
}
