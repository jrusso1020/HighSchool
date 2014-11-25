/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;

public class PartApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Part arr[]= new Part[2];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Part Number: ");
            String a= in.nextLine();
            System.out.println("Enter Part Color: ");
            String b= in.nextLine();
            System.out.println("Enter Part Price: ");
            String c= in.nextLine();
           
            arr[i]= new Part(a,b,c);
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].toString());
        }
        System.out.println("Parts are equal: " + arr[0].equals(arr[1]));
    }
}
