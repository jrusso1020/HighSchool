/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;
public class Sequential1 {
    public static String sequentialSearch(int arr[][], int num){
        String line="";
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==num){
                    return line="("+i+","+j+")";
                }
            }
        }
        return null;
    }
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int array[][]={{3,4,2},{5,6,7},{1,8,9}};
        System.out.println("Enter target:");
        int tar=in.nextInt();
        in.nextLine();
        String a=sequentialSearch(array,tar);
        System.out.println(a);
    }
}
