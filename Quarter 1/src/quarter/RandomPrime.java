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
import java.util.Scanner;

public class RandomPrime {
    public static boolean isPrime(int n){
        int count; int sum; boolean flag = true;
        double square = Math.sqrt(n);
        for(count=2;count<=square;count++){    
                sum=n%count;
        if (sum==0){
            flag = false;}
        
        }
         return flag;
    }
    public static void randomGen(int x){
        int count;
        Random jack = new Random();
        for(count=1;count<=x;count++){
        int number1 = (jack.nextInt(40) + 10);
        System.out.println(number1 + "\t" + isPrime(number1));
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of random numbers:");
        int rand = in.nextInt();
        System.out.println("Number" + "\t" + "Prime");
        randomGen(rand);
        
    }
    
}
