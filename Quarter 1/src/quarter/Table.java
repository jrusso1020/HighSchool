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

public class Table {
    public static void main(String[] args){
        int count; double square; double cube;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number less than 20:");
        int number = in.nextInt();
        System.out.println("Integer    Square     Cube");
        in.nextLine();
        for(count=1;count<=number;count++){
            square = Math.pow(count,2);
            cube = Math.pow(count,3);
            System.out.println(count + "           " + square + "       " + cube);
        }
        
    }
    
}
