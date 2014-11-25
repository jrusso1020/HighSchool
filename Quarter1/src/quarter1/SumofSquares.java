package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class SumofSquares {
    public static void main(String[] args){
        long sum1=0; long sum2=0; double x; double answer=0;
        for(int i=1; i<=100; i++){
            sum1+=Math.pow(i,2);
            sum2+=i;
        }
        x=Math.pow(sum2,2);
        answer=x-sum1;
        System.out.println(answer);
    }
    
}
