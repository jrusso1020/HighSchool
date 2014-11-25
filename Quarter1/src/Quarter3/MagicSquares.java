/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author jamesrusso
 */
import java.util.ArrayList;
import java.util.Random;

public class MagicSquares {
    public static void main(String[] args){
        Random rd= new Random();
        ArrayList<Integer> nums= new ArrayList<Integer>();
        int arr[][]= new int[3][3];
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    int ran= rd.nextInt(9)+1;
                    while(nums.indexOf(ran)>=0){
                       ran= rd.nextInt(9)+1;
                    }
                    arr[i][j]=ran;
                    nums.add(ran);          
                }
            }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}

