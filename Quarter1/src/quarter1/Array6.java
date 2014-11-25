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

public class Array6 {
    public static void main(String[] args){
        int sum = 0; String y; int i; int x;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Line of Sequence:");
        String line = in.nextLine();
        String arr[] = line.split(" ");
        int num[] = new int[arr.length];
        for(i=0;i<arr.length;i++){
            y=arr[i];
            num[i]= Integer.parseInt(y);
        }
        for(int n = 0; n<num.length; n++){
            if(n==0 || n%2==0)
                x=num[n];
            else
                x= -num[n];
            sum+=x;
        }
        System.out.println("Alternating Sum of sequence = " + sum);
    }
    
}

