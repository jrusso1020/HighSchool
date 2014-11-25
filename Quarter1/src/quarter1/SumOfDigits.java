package quarter1;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        int i; int max=0; String y; int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Line of Sequence:");
        String line = in.nextLine();
        String arr[] = line.split(" ");
        int num[] = new int[arr.length];
        for(i=0;i<arr.length;i++){
            y=arr[i];
            num[i]= Integer.parseInt(y);
        }
        for(int j=0; j<num.length-5; j++){
            sum=num[j]*num[j+1]*num[j+2]*num[j+3]*num[j+4];
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
