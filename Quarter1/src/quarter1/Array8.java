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

public class Array8 {
    public static void main(String[] args){
        int i; String y; double sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Line of Sequence:");
        String line = in.nextLine();
        String arr[] = line.split(" ");
        double num[] = new double[arr.length];
        for(i=0;i<arr.length;i++){
            y=arr[i];
            num[i]= Double.parseDouble(y);
        }
        for(double e: num)
            sum+=e;
        double length = num.length;
        double avg = sum/length;
        System.out.println("Average: " +avg);
        for(i=((int)length-1);i>=0;i--){
            System.out.println(num[i]);
        }
            
    }
    
}

