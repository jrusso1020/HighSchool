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

public class AddStrings {
    public static void addString(String x, String n){
        int length1= x.length();
        int length2= n.length();
        int half1= length1/2;
        int half2= length2/2;
        String x2 = x.substring(0, (half1));
        String n2 = n.substring(half2);
        System.out.println(x2+n2);
    } 
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Word 1:");
        String str1 = in.nextLine();
        System.out.println("Enter Word 2:");
        String str2 = in.nextLine();
        addString(str1, str2);
        
    }
    
}
