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

public class BigNumber {
    public static void main(String[] args){
        int max=0; int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        String y= in.nextLine();
        int arr[]= new int[1000];
        for(int i=0; i<1000; i++){
            int x= Integer.parseInt(y.substring((i+1)));
            arr[i]=x;
        }
        for(int i=0; i<996; i++){
            sum=(arr[i]*arr[i+1]*arr[i+2]*arr[i+3]*arr[i+4]);
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
