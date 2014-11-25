package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valued User
 */
public class PrimeNum {
    public static boolean prime(int x){
        int count; int sum; boolean flag = true;
        double square = Math.sqrt(x);
        for(count=2;count<=square;count++){    
                sum=x%count;
        if (sum==0){
            flag = false;}
        
        }
        return flag;
    }
    public static void main(String[] args){
        int cnt=0; long num=0;
            for(int i=2; i<2000000; i++){
                if(prime(i)==true){
                    cnt++;
                    num+=i;
                }
            }
        System.out.println(num + "  "  + cnt);
    }
    
    
}

