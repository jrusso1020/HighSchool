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

public class MyArray {
    private int arr[];
    public MyArray(int size, int max){
        Random rd= new Random();
        arr= new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i]= (rd.nextInt(max)+1);
        }
    }
    @Override
    public String toString(){
        String y = "[";
        for(int i=0; i<arr.length; i++){
            if(i==(arr.length-1)){
                y+= arr[i];
            }
            else{
                y+= arr[i] + ", ";
            }   
        }
        y+= "]";
        return y;
    }
}
