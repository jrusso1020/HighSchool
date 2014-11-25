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

public class Array7 {
    public static void main(String[] args){
        int i; int sum=0; String y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Line of Sequence:");
        String line = in.nextLine();
        String arr[] = line.split(" ");
        int num[] = new int[arr.length];
        for(i=0;i<arr.length;i++){
            y=arr[i];
            num[i]= Integer.parseInt(y);
        }
        for(int e: num)
            sum+=e;
        System.out.println("Sum: " + sum);
    }
    
}
