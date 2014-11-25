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
import java.util.Random;

public class MenuSquare {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random jack = new Random();
        int choice; int number;
        do{
            System.out.println("Choose a Number");
            System.out.println("1. Square Root");
            System.out.println("2. Cubed Root");
            System.out.println("3. Random Interger");
            System.out.println("4. Exit");
            choice = in.nextInt();
            if(choice==1){
                System.out.println("Enter a number:");
                number = in.nextInt();
                double square = Math.sqrt(number);
                if (number>=0){
                    System.out.println("Square Root:" + square);
                }
                else{
                    System.out.println("Invalid for square root");
                }
            }
            else if(choice==2){
                System.out.println("Enter a number:");
                number = in.nextInt();
                double cube = Math.pow(number,1.0/3);
                if (number>=0){
                    System.out.println("Cubed Root:" + cube);
                }
                else{
                    System.out.println("Invalid cubed root");
                }
            }
            else if(choice==3){
                number = (jack.nextInt(90) +10);
                System.out.println("Random Number:" + number);
            }
            
        }
        while(choice!=4);
    }
    
}

