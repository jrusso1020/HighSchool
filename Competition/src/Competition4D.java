/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;
public class Competition4D {
    public static void main(String[] args){
        int index; int index2=0; int i; int n=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a numerator and a denominator: ");
        String line= in.nextLine();
        String arr[]= line.split(" ");
        double numer= Double.parseDouble(arr[0]);
        double denom= Double.parseDouble(arr[1]);
        double num=numer/denom;
        String word= Double.toString(num);
        index= word.indexOf(".");
        word=word.substring(index+1);
        for(i=0; i<word.length()-1; i++){
            String word2="l"+word.substring(i+1);
            n=word2.indexOf(word.substring(i,(i+1)));
            if(n>i && word.substring(i,n).equals(word.substring(n,(n+(n-i))))){
                break;
            }
        }
        System.out.println("Repeating Digit(s): " + word.substring(i,n));
    }
    
}

