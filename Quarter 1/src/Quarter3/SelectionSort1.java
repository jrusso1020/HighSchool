/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
import java.util.*;
public class SelectionSort1 {
    public static int compareString(String x, String y){
        int length1=x.length(); int length2=y.length();
        if(length1==length2){
            return x.compareTo(y);
        }
        return length1-length2;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter line of strings separated by spaces: ");
        String line= in.nextLine();
        String arr[]= line.split(" ");
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(compareString(arr[i], arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
