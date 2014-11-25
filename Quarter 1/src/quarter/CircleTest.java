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

public class CircleTest {
    public static void main(String[] args){
        Circle circ = new Circle();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        int x= in.nextInt();
        circ.setRadius(x);
        System.out.println("Radius: " + circ.getRadius());
        System.out.println("Area: " + circ.computeArea());
        System.out.println("Circumference: " + circ.computeCircumference());
    }
    
}
