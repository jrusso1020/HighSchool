/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.Scanner;

public class Competition4C {
    public static void main(String[] args){
        double time1=0; double time2=0; double d=0; double i;
        Scanner in = new Scanner(System.in);
        System.out.println("Speed of Train1: ");
        double train1= in.nextDouble();
        System.out.println("Speed of Train2: ");
        double train2= in.nextDouble();
        if(train1>train2){
            d=((-train1*50)/(train2-train1));
            if(d>100){
                d=((train1*50)/(train2-train1));
                double x=d;
                d++;
                d+=(int)(x/100);
                d%=100;
                d+=100;
            }
            System.out.println("Output: Trains meet at mile " + d);
        }
        else if(train2>train1){
            d=((train1*50)/(train2-train1));
            double x=d;
            d++;
            d+=(int)(x/100);
            d%=100;
            System.out.println("Output: Trains meet at mile " + d);        
            
        }
        else{
            System.out.println("Output: Trains do not Meet");
        }
        
    }
    
}



