package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Random;

public class ArrayPermutation {
     public static int factorial(int x){
        int i; int result=1;
        for(i=1;i<=x;i++)
            result*=i;
        return result;
     }
    public static void permutation(int a[], int x){
        Random y = new Random();
        int n[]= new int[x];
        for(int i=0; i<x; i++)
            n[i]=(y.nextInt(10)+1);
        System.out.println(x + "\t" + factorial(x));

        
    }
    public static void main(String[] args){
        Random jack = new Random();
        int y[]= {1,2,3,4,5,6,7,8,9,10};
        int arr[]= new int[20];
        for(int i=0; i<20; i++)
            permutation(arr, y[jack.nextInt(10)]);
    }
}
