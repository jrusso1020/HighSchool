package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;

public class ArrayShuffle {
    public static void shuffle(int a[]){
        int i=0; int n=0;
        int length = a.length;
        int z[]= new int[length/2];
        int y[]= new int[length/2];
        for(int k=0; k<(length/2); k++)
            z[k]=a[k];
        for(int k=0; k<(length/2); k++)
            y[k]=a[(length/2)+k];
        for(int j=0; j<length; j++){
            if(j==0 || j%2==0){
                a[j]=z[i];
                i++;
            }
            else{
                a[j]=y[n];
                n++;
            }     
        }
        System.out.println("Index\tValue");
        for(int q=0; q<length; q++)
        System.out.println(q+ "\t" + a[q]);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int arr[]= new int[10];
        System.out.println("Enter 10 Numbers:");
        for(int i=0; i<10; i++)
            arr[i]= in.nextInt();
        shuffle(arr);
    }
}
