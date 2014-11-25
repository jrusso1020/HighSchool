package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valued User
 */
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args){
        Random jack = new Random();
        int number1 = (jack.nextInt(99) + 1);
        int number2 = (jack.nextInt(99) + 1);
        System.out.println("Number 1:" + number1 + " Number 2:" + number2);
    while(Math.sqrt(number1)!=number2 || Math.sqrt(number2)!=number1){
        number1 = (jack.nextInt(99) + 1);
        number2 = (jack.nextInt(99) + 1);
        System.out.println("Number 1:" + number1 + " Number 2:" + number2);
    }
    }
}
