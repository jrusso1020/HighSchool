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
public class MaxNumber {
    public static int findMax(int n, int x){
        int result;
        if(n>x){
            result=n;
            return result;
        }
        else{
            result=x;
            return result;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1:");
        int n = in.nextInt();
        System.out.println("Enter Number 2:");
        int x = in.nextInt();
        System.out.println("Max Number: " + findMax(n,x) );
    }
    
}
