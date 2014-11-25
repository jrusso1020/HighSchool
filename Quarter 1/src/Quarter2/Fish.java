/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.Random;

public class Fish {
    public static void main(String[] args){
        Random rd= new Random();
        int breed=rd.nextInt(7);
        int move=rd.nextInt(2);
        int die=rd.nextInt(5);
        System.out.println("Fish: ");
        if(breed==0){
            System.out.println("Breeds ");
        }
        else if(breed!=0 && move==0){
            System.out.println("Move");
        }
        else if(breed!=0 && move!=0 && die==0){
            System.out.println("Die");
        }
        else{
            System.out.println("Does Nothing");
        }
    }
    
}
