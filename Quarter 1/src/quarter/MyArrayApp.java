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

public class MyArrayApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int size= in.nextInt();
        System.out.println("Enter Max Random Number: ");
        int max= in.nextInt();
        MyArray object= new MyArray(size, max);
        System.out.println(object.toString());
    }
}
