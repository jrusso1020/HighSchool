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

public class ArrayIzzle {
    public static void izzilizer( String x[]){
        String n[] = new String[x.length];
        for(int i = 0; i<x.length; i++){
            n[i] = (x[i] + "izzle");
            System.out.print(n[i].toUpperCase());
        }
            
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String:");
        String line = in.nextLine();
        String arr[] = line.split(" ");
        izzilizer(arr);
    }
}


