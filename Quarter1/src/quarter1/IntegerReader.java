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

public class IntegerReader {
    public static void main(String[] args){
        int count=0; double sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number; Enter 0 to stop:");
        int number = in.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(number>0){
            count++;
            if(number>max){
                max=number;
            }
            if(number<min){
            min=number;
        }
            sum+=number;
            System.out.println("Enter a positive number; Enter 0 to stop:");
            number = in.nextInt();
        }
        double average = sum/count;
        System.out.println("Average:" + average + " Max:" + max + " Min:" +min);
      
    }
}
