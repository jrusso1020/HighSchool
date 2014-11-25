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

public class InsertionSort3 {
      public static int compareString(String x, String y){
        int length1=x.length(); int length2=y.length();
        if(length1==length2){
            return x.compareTo(y);
        }
        return length1-length2;
    }
    public static String[] insertionSort3(String[] a){
        int i,j,k;
        for(i=1; i<a.length; i++){
            String current=a[i];
            j=0;
            while(compareString(a[j], current)<0){
                j++;
                }
            for(k=i; k>j; k--){
                    a[k]=a[k-1];
            }
            a[j]=current;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter line of Strings: ");
        String line= in.nextLine();
        String arr[]= line.split(" ");
        String dat[]=insertionSort3(arr);
        System.out.println("");
        for(int i=0; i<dat.length; i++){
            System.out.print(dat[i] + " ");
        }
    }
}
