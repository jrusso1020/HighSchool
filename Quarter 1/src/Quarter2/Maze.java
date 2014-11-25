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

public class Maze {
    Random rd= new Random();
    private int arr[][];
    public Maze(int a[][]){
        this.arr=a;
        for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[i].length; j++){
                    if(i==0 || i==(arr.length-1)){
                        arr[i][j]=1;
                }
                    else if(j==0 || j==(arr[i].length-1)){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=rd.nextInt(2);
                    }
            }
        }
    }
    public void printMaze(){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==1){
                    System.out.print("x");
                }
                else if(arr[i][j]==0){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
