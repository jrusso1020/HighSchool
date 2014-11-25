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

public class Array3 {
    public static void main(String[] args){
        String name[] = new String[4];
        Scanner in = new Scanner(System.in);
         for(int i=0; i<4; i++){
            System.out.println("Enter Name" + (i+1) + ":");
            name[i]= in.nextLine();
        }
        for(int x=0; x<4; x++)
            System.out.println((x+1) + ": " + name[x]);
    }
    
}

