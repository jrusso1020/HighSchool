package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class NaturalBelowThousand {
    public static void main(String[] args){
        int sum=0;
    for(int i=1; i<1000; i++){
        if(i%3==0 || i%5==0){
            sum+=i;
        }
        
    }
    System.out.println("Sum: " + sum);
}
}
