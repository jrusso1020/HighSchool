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

public class RootSolver {
    public static void main(String[] args){
        double root1=0; double root2=0; double answer=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your A value:");
        int a = in.nextInt();
        System.out.println("Enter your B value:");
        int b = in.nextInt();
        System.out.println("Enter your C value");
        int c = in.nextInt();
        root1+=((-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
        root2+=((-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a));
        if(a==0 && b==0 && c==0){
            System.out.println("any value of x can be the solution");
        }
        else if(a==0 && b==0){
            System.out.println("No Solution!");
        }
        else if (a==0){
            answer+=(-c)/b;
            System.out.println("solution is " + answer);
        }
        else if (a!=0 && (Math.pow(b,2)-(4*a*c))>0){
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else{
            System.out.println("The quadratic equation has no solution");
        }
    }
    
}

