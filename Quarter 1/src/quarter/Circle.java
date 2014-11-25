package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class Circle {
    private int radius;
    private final double pi=3.14;
    public void setRadius(int x){
        radius=x;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public double computeArea(){
        double area;
        area=pi*Math.pow(radius,2);
        return area;
    }
    
    public double computeCircumference(){
        double circumference;
        circumference= 2*pi*radius;
        return circumference;
    }
}
