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

public class Table {
    public static void main(String[] args){
        int count; double square; double cube;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number less than 20:");
        int number = in.nextInt();
        System.out.println("Interger Square\tCube");
        for(count=1;count<=number;count++){
            square = Math.pow(count,2);
            cube = Math.pow(count,3);
            System.out.println(count + "\t" + square + "\t" + cube);
        }
        
    }
    
}
