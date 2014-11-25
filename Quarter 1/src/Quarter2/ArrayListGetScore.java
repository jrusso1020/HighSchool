/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGetScore {
    public static double getScore(ArrayList<String> ans, ArrayList<String> key){
        double score=0;
        for(int i=0; i<ans.size(); i++){
            if(ans.get(i).equals(key.get(i))){
                score++;
            }
            else if(!ans.get(i).equals(key.get(i)) && !ans.get(i).equals("?")){
                score-=.25;
            }
        }
        return score;
    }
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        ArrayList<String> ans= new ArrayList<String>();
        ArrayList<String> key= new ArrayList<String>();
        System.out.println("Enter Answers: ");
        String line1= in.nextLine();
        String arr1[]= line1.split(",");
        System.out.println("Enter Key: ");
        String line2= in.nextLine();
        String arr2[]= line2.split(",");
        for(int i=0; i<arr1.length; i++){
            ans.add(arr1[i]);
            key.add(arr2[i]);
        }
        System.out.println("Score: " + getScore(ans, key));
    }
}
