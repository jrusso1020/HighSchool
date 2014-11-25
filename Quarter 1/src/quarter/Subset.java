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

public class Subset {
    public static int factorial(int x){
        int i; int result=1;
        for(i=1;i<=x;i++)
            result*=i;
        return result;

    }
    public static void extract(int n, int m){
        int c= (factorial(n))/((factorial(m)) * factorial(n-m));
        System.out.println("Number of subsets m in set n:" + c);
        
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number in Set:");
        int set = in.nextInt();
        System.out.println("Enter Number in Subset:");
        int subset = in.nextInt();
        extract(set,subset);
    }
    
}
