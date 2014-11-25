package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int x, int y){
        this.width=x;
        this.height=y;
    }
    
    public void printInfo(){
        System.out.println("Width: " + width + "  Height: " +height );
    }
    
}
