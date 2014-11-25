/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Dedupe8 {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("src/competition/texts/dedupe.dat"));
        int iner = in.nextInt();
        in.nextLine();
        ArrayList <String[]> list = new ArrayList<>();
        String[] str = null;
        String sIner;
        for (int i = 0 ; i <iner; i++){
            sIner = in.nextLine();
            System.out.println(sIner);
            for (int r =0; r<sIner.length()-1;r++)
              if (sIner.substring(r,r+1).equals(sIner.substring(r+1,r+2))){
                  sIner = sIner.substring(0,r+1)+sIner.substring(r+2); 
                  r--;
              }
            str = sIner.split(" ");
            list.add(str);
        }
        for (int i =0; i<list.size(); i++){
            System.out.println();          
            for (int k = 0; k<list.get(i).length;k++)
                System.out.print(list.get(i)[k]);

                }
        
    }
}
