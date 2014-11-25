package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class Main {
    public static void main(String args []){
        String name= "James"; String x="";
        for(int i=0; i<name.length(); i++){
            x=name.substring(i, i+1)+x;
        }
        System.out.println(x);
    }
}
