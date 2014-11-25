package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class FibEvenAdd {
    public static void main(String[] args){
        int num1=1; int num2=2;int sum=2; int num3=0;
        while(num2<4000000){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            if(num2%2==0){
                sum+=num2;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
