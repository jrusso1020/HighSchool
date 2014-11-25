/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.ArrayList;
import java.util.Random;
public class ArrayList3 {
    public static void main(String[] args){
        Random rd= new Random();
        ArrayList<Double> list= new ArrayList<Double>();
        for(int i=0; i<10; i++){
            list.add(rd.nextDouble());
        }
        System.out.println(list);
        double arr[]= new double[list.size()];
        for(int i=0; i<10; i++){
            arr[i]=list.get(i);
        }
        for(int i=0; i<10; i++){
            if(arr[i]<.5){
                list.remove(list.indexOf(arr[i]));
            }
        }
        System.out.println(list);
    }
}
