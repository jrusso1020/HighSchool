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

public class CharPrint {
    public static void printChar(String a, int x, int n){
        int j; int i;
        for(j=1;j<=x;j++){
            for(i=1;i<=n;i++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Character:");
        String a = in.nextLine();
        System.out.println("Enter Number of Rows:");
        int x = in.nextInt();
        System.out.println("Enter Number of characters per row:");
        int n = in.nextInt();
        printChar( a, x, n);
    }    
}
