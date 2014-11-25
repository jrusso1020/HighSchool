package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class TriangularNumberApplication {
    public static void main(String[] args){
        TriangularNumber numArray[]= new TriangularNumber[20];
        System.out.println("Triangular Numbers 1-20");
        for(int i=0; i<20; i++){
            numArray[i]= new TriangularNumber(i+1);
            System.out.println("Number " + (i+1) + " : " + numArray[i].computeNumber());
        }
    }
    
}
