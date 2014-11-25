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

public class NumberPyramid {
     public static void main(String[] args) {
     int n;
     Scanner in = new Scanner(System.in);
     System.out.println("Enter Number of Rows:");
     int x = in.nextInt();
     for (int i = 1; i <= x; i++) { 
         n=i;
        for (int j = 1; j <= x - i; j++)  
            System.out.printf("%5s", "");  
        for (int k = i; k >= 1; k--){
            System.out.printf("%5d",n);
            n++;
            }
        n-=1;
        for (int k = 1; k <=(i-1); k++){
            n--;    
            System.out.printf("%5d", n); 
            }
        System.out.println();
    }  
  }
}
