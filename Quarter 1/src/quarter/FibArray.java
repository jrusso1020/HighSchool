package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class FibArray {
    public static void main(String[] args){
        int sum=0;
        int fib[] = new int[20];
        fib[0]=1;
        fib[1]=1;
        for(int i=2; i<20;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println("Digit\tValue");
        for(int n =0;n<20; n++)
            System.out.println((n+1) + "\t" + fib[n]);
    
    }
    
}
