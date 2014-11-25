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
import java.io.*;

public class SelectionSort2 {
    public static void main(String[] args) throws IOException{
        Scanner amadeus= new Scanner(new File("Phone1.dat"));
        String nums= amadeus.nextLine();
        String arr[]=nums.split(" ");
        System.out.println("Original Array of Numbers: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted Array of Numbers: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        Random rd= new Random();
        int search=rd.nextInt(arr.length);
        System.out.println("");
        System.out.println("Searching for: "+ arr[search]);
        int left=0; int right=arr.length-1; int middle=0; int index=0;
        while(left<=right){
            middle=(left+right)/2;
            if(arr[search].equals(arr[middle])){
                index=middle;
                break;
            }
            else if(arr[search].compareTo(arr[middle])<0){
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        System.out.println("Found " + arr[index] + " at index " + index);
        String line="";
        for(int i=0; i<arr.length; i++){
            line+=arr[i];
            if(i!=arr.length-1){
                line+=" ";
            }
        }
        PrintWriter out= new PrintWriter("Phone1.dat");
        out.println(line);
        out.close();
    }
}
