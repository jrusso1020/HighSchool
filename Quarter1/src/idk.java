/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.util.*;
public class idk {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Number:");
        int x=in.nextInt();
        double ans=Math.pow(x,2)+x;
        if(ans==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
