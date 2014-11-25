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

public class RectangleApplication {
    public static void main(String[] args){
        int x; int y;
       
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Width of Rectangle: ");
        x = in.nextInt();
        System.out.println("Enter Height of Rectangle: ");
        y= in.nextInt();
        Rectangle rect = new Rectangle(x, y);
        rect.printInfo();
    }
    
}
