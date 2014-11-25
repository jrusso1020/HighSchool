package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.Scanner;

public class Competition2 {
    public static void main(String[] args){
        String x=""; String y="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter line:");
        String line= in.nextLine();
        for(int i=0; i<line.length();i++){
            if(i==0 || i%2==0){
                y+=line.substring(i,(i+1));
                y+=" ";
            }
            else if(i%2!=0){
                x+=line.substring(i,(i+1));
                x+=" ";
            }
            
        }
        String[] num1 = x.split(" ");
        String[] num2 = y.split(" ");
        
        System.out.println(num1[0]);
        
        
    }
    
}
