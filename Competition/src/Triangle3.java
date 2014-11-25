/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.*;
import java.io.*;
public class Triangle3 {
    public static void main (String[] args) throws IOException{ 
        String[] Alpha = {"A", "B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Scanner in = new Scanner(new File("src/competition/texts/triangle.dat"));
        int length = in.nextInt();
        in.nextLine();
        String iner;
        String[] wallow;        
        int[] numbs = new int[length];
        String [] lets = new String[length];
        for (int i =0; i<length;i++){
            iner = in.nextLine();
            wallow = iner.split(" "); 
            numbs[i] = Integer.parseInt(wallow[0]);
            lets[i] = wallow[1];
        }
        //triangles set hopefully.
        int start=0;
        int count;
        int pCount;
        for (int i =0; i <length; i++){// to go through each one
            count =0;
            for (int r = 0; r<Alpha.length;r++) //to locate the start of lets
                if (Alpha[r].equals(lets[i]))
                    start =(r-1);
            for (int r = 0; r<numbs[i]+1;r++){//goes through each                   
                pCount = count;
                System.out.println();
                while(pCount>0){
                    System.out.print(Alpha[start]);
                    pCount--;
                }
                start++;
                if (start ==26)
                    start=0;
                count++;                
            }
        }
        
                
    }
}
