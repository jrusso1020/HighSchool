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

public class Fish2 {
     public static void main(String[] args){
        Random rd= new Random();
        for(int i=0; i<10; i++){
            System.out.println("Fish" + (i+1));
            int breed=rd.nextInt(7);
            int move=rd.nextInt(2);
            int die=rd.nextInt(5);
            if(breed==0){
                System.out.println("Breeds ");
            }
            else if(breed==0 && move==0){
                System.out.println("Move");
            }
            else if(breed==0 && move==0 && die==0){
                System.out.println("Die");
            }
            else{
                System.out.println("Does Nothing");
            }
            System.out.println();
        }
    }
    
}
