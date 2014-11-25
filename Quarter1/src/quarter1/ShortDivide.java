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

public class ShortDivide {
    public static void divide(int a, int b, int c, int d, int z){
        int a2; int b2; int c2;
        a2=a;
        b2=b +(z * a2);
        c2=c +(z * b2);
        if(z>0)
            System.out.print("(x-" + z+")");
        else if(z<0)
            System.out.print("(x+" + (-z)+")");
        System.out.print("(" + a2 + "x^2");
        if(b2>0)
            System.out.print("+" + b2 + "x");
        else if(b2<0)
            System.out.print("-" + (-b2) + "x");
        if(c2>0)
            System.out.print("+" + c2 + ")");
        else if(c2<0)
            System.out.print("-" + (-c2) + ")");
        else if(d==0)
            System.out.print(")");
             
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value A:");
        int a = in.nextInt();
        System.out.println("Enter value B:");
        int b = in.nextInt();
        System.out.println("Enter value C:");
        int c = in.nextInt();
        System.out.println("Enter value D:");
        int d = in.nextInt();
        System.out.println("Enter value of one zero");
        int z = in.nextInt();
        divide(a, b, c, d, z);   
        
    }
}

