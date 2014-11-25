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

public class ArrayMerge {
    public static void merge(String a[], String b[], String c[]){
        int index=0;
        int cnt=0;
        for(int i=0; i<c.length; i++){
            if(a[cnt].compareToIgnoreCase(b[index])<0){
                c[i]=a[cnt];
                cnt++;
            }
            else if(a[cnt].compareToIgnoreCase(b[index])>0){
                c[i]=b[index];
                index++;
            }
            else if(a[cnt].compareToIgnoreCase(b[index])==0){
                c[i]=a[cnt];
                cnt++;
                index++;
            }
            System.out.println(i + "\t" + c[i]);
        }

        }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length of Array 1:");
        int x= in.nextInt();
        in.nextLine();
        String arr1[]= new String[x];
        System.out.println("Enter Length of Array 2:");
        int y = in.nextInt();
        in.nextLine();
        String arr2[]= new String[y];
        System.out.println("Enter words for Array 1:");
        for(int i=0; i<x; i++)
            arr1[i]= in.nextLine();
        System.out.println("Enter words for Array 2:");
        for(int i=0; i<y; i++)
            arr2[i]= in.nextLine();
        String arr3[]= new String[3];
        merge(arr1, arr2, arr3);
    }
    
}
