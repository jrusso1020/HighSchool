/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package competition;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author James.Russo
 */
public class Gnome {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<int[]> a = new ArrayList<>();
        ArrayList<Integer> startList = new ArrayList<Integer>();
        ArrayList<int[]> realStart = new ArrayList<>();
        int temp=0;
        int[] start;
        int insert = in.nextInt(), count =0;
        String line;
        String[] sLine;
        in.nextLine();
        while (insert !=0){
            int array[] = new int[insert];
            line = in.nextLine();
            sLine = line.split(" ");
            for (int i = 0; i<array.length; i++)
                array[i] = Integer.parseInt(sLine[i]);         
            a.add(array);
            count++;
            insert = in.nextInt();
            in.nextLine();
            if (insert ==0)
                break;
        }
       
        for (int i =0; i<a.size(); i++){ //number of pots to sort            
            for (int r =0; r <a.get(i).length-1;r++){ // goes into the pots                
                    if (a.get(i)[r+1] <a.get(i)[r]){
                        
                        a.get(i)[r] = temp;
                        a.get(i)[r] = a.get(i)[r+1];
                        a.get(i)[r+1] =temp;
                        startList.add((1+r));
                       
                         for (int k =r; k>0;k--)
                             if (a.get(i)[k]>a.get(i)[k-1]){
                                 a.get(i)[k] =temp;
                                 a.get(i)[k] = a.get(i)[k-1];
                                 a.get(i)[k-1]=temp;   
                                 startList.add(k);
                             }
                         r--;
                       
                    } 
                    System.out.println(r);
            }            
                
            start = new int[startList.size()];
            for (int j = 0; j<start.length;j++)
                start[j] = startList.get(j);
            realStart.add(start);
            startList.clear();
        }
        System.out.println();     
         for (int i = 0; i<a.get(0).length;i++)
             System.out.println(a.get(0)[i]);
         for(int r = 0;r<realStart.size();r++){  
             System.out.println("Garden "+ (r+1));
             for (int k =0; k< realStart.get(r).length;k++){
             System.out.println("The gnome swaps the pots at  positions "+ realStart.get(r)[k]+" and "+(realStart.get(r)[k]+1));
             }
             System.out.println("Sorted!");
         }
             
     }   
    
}
