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

public class CountT {
    public static int count(String str){
        int count=0;
        int t = str.indexOf("t");
        while(t!=-1){
            count++;
            str= str.substring(0,t) + "f" + str.substring(t +"t".length());
            t=str.indexOf("t");
            
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word or sentence that contains the letter T:");
        String str = in.nextLine();
        System.out.println("Number of times T appears:" + count(str));
    }
    
}

