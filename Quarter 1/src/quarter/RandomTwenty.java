package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Random;

public class RandomTwenty {
    public static void main(String[] args){
       Random rd= new Random();
       int arr[]= new int[10];
       for(int i=0; i<arr.length; i++){
           arr[i]= (rd.nextInt(20)+1);
       }
       for(int i=0; i<arr.length; i++){
           if(arr[i]>10){
               System.out.print(arr[i] + "(t) ");
           }
           else{
               System.out.print(arr[i] + "(f) ");
           }
       }
    }
}
