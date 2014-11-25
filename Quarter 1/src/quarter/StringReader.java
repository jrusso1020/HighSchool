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

public class StringReader {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String 1:");
        String str1 = in.nextLine();
        System.out.println("Enter String 2:");
        String str2 = in.nextLine();
        int i = str1.indexOf(str2);
        int x = i+1;
        if (i!=-1){
        System.out.println("String 2 occurs at index:" + i + " and letter: " + x );
    }
        else{
            System.out.println("String 2 does not occur in String 1");
        }
        String str = str1.substring(0,3);
        System.out.println("The first three letters of string 1 are: " + str);
        int length1 = str1.length();
        int length2 = str2.length();
        int first = length1 - length2;
        String str1Length = str1.substring(first,length1);
        if (first>0){
        System.out.println("The end of string 1 with length string 2 is:" + str1Length);
        }
        else {
            System.out.println("String 1 is shorter than string 2");
        }
        int n= length2/2;
        String half = str2.substring(0,n);
        System.out.println("Half of string 2 is: " + half);
        
    }
    
    
}
