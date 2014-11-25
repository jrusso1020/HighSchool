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
public class Binary1 {
    public static int BinarySearch(String arr[], String tar){
        Arrays.sort(arr);
        int left=0; int right=arr.length-1; int middle=0;
        while(left<=right){
            middle=(left+right)/2;
            if(tar.equals(arr[middle])){
                return middle;
            }
            else if(tar.compareTo(arr[middle])<0){
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return -1;
        
    }
    
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter words for array of String with spaces:");
        String line= in.nextLine();
        String a[]=line.split(" ");
        System.out.println("Enter target word:");
        String tar=in.nextLine();
        int index=BinarySearch(a, tar);
        System.out.println(index);
    }
}
