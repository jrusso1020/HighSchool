/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Double> a= new ArrayList<Double>();
        for(int i=0; i<10; i++){
            System.out.println("Enter Double: ");
            a.add(in.nextDouble());
        }
        System.out.println("Array List: ");
        for(double b: a){
            System.out.print(b + " ");
        }
        System.out.println();
        System.out.println("Enter Target: ");
        double tar= in.nextDouble();
        int index= a.indexOf(tar);
        System.out.println("Index of Target; if target not in list equals -1: " + index);
        int cnt=0;
        for(double b: a){
            if(b>5){
                cnt++;
            }
        }
        System.out.println("Number of Numbers greater than 5: " + cnt);
        double min=a.get(0);
        for(double b: a){
            if(b<min){
                min=b;
            }
        }
        System.out.println("Minimum: " + min + " Index: " + a.indexOf(min));
    }
}
