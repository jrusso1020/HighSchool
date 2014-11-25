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

public class NumberCube {
   public int toss(){
       Random rd= new Random();
       int toss= (rd.nextInt(6)+1);
       return toss;
   } 
    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        int arr[]= new int[numTosses];
        for(int i=0; i<numTosses; i++){
            arr[i]=cube.toss();
        }
        return arr;
        
    }
    
    public static int getLongestRun(int values[]){
        int y=0; int cnt;  int index=0;
        for(int i =0; i<values.length; i++){
            cnt=1;
            for(int j= 1; j<(values.length-1);j++){
                if(values[i]==values[j])
                    cnt++;
            }
            if(cnt>y){
                y=cnt;
                index=i;
            }
        }
        return index;
    }
}
