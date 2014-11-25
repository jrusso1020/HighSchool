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
import java.util.Scanner;

public class MagicOddSquare {
    public static void main(String[] args){
        int i=0; int j=0;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter odd number for square: ");
        int size= in.nextInt();
        int arr[][]= new int[size][size];
        ArrayList<Integer> index= new ArrayList<Integer>();
        for(int k=0; k<size; k++){
            for(int m=0; m<size; m++){
                index.add((k*10)+m);
            }
        }
        for(int n=1; n<=Math.pow(size,2); n++ ){
            if(n==1){
                i=size-1;
                j=(size/2)+1;
                arr[i][j]=n;
                index.remove(index.indexOf((i*10)+j));
                i=0;
                j+=1;
            }
            else if(index.indexOf((i*10)+j)!=-1){
                if(i<size && j<size){
                    arr[i][j]=n;
                    index.remove(index.indexOf((i*10)+j));
                    
                }
            }
        }
    } 
}
