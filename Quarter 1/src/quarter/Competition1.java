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

public class Competition1 {
    public static void main(String[] args){
        boolean flag= false; int x=0; int y=0; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number one and number 2:");
        int n1= in.nextInt();
        int n2= in.nextInt();
        if(n1>n2){
            x=n1;
            y=n2;
        }
        else{
            x=n2;
            y=n1;
            
        }
        for(int i=2; i<x; i++){
            if(x%i==0 && y%i==0){             
                        flag=true;
                    }
        }
     if(flag==true)
         System.out.println(n1 + " and " + n2 + " share factors");
     else{
         System.out.println(n1 + " and " + n2 + " do not share factors");
     }
        
    }
    
}
