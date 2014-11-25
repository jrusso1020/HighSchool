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

public class Palindrome {
    public static void palindromeTester(String x){
        String str2 = "";
        String n=x;
        int length2= x.length();
        for(int i=0; i<=(length2-1);i++){
            str2+= x.substring(length2-1-i);
            x=x.substring(0, (length2-1-i));
        }
        System.out.println(str2);
        boolean y = n.equalsIgnoreCase(str2);
        System.out.println("String is the same reversed:" + y);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = in.nextLine();
        palindromeTester(str);
    }
    
}

