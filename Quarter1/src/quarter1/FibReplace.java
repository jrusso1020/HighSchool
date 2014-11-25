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

public class FibReplace {
    public static int[] fibReplace( int a[]){
        int fib[] = new int[20];
        fib[0]=1;
        fib[1]=1;
        for(int i=2; i<20;i++)
            fib[i]=fib[i-1]+fib[i-2];
        for(int i=0; i<20; i++)
            a[i] = fib[i];
        return a;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         int a[]= new int[20];
        for(int i=0; i<20; i++){
            System.out.println("Enter Number" + (i+1) + ":");
            a[i]= in.nextInt();
    }
        fibReplace(a);
        System.out.println("Digit\tValue");
    for(int i =0; i<20; i++)
            System.out.println((i+1) + "\t" + a[i]);
    
}
}

