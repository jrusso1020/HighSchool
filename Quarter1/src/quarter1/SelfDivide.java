package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valued User
 */
import java.util.Scanner;

public class SelfDivide {
    public static void isSelfDivisor(int n){
        boolean flag=true;
        int x=n;
        while(x>0){
            int rem = x%10;
            x=x/10;
            if(rem==0)
                flag=false;
            else if(n%rem!=0)
                flag=false;
        }
        System.out.println("Number is divisible by all of its digits:" + flag);
        
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number enter 0 to stop:");
        int num= in.nextInt();
        while(num>0){
            isSelfDivisor(num);
            System.out.println("Enter Number enter 0 to stop:");
            num = in.nextInt();
        }
        
    }
}
