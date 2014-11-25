package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class palindromeNumbers {
    public static boolean palindrome(int x){
        int num=0; int rem=0; int cnt=2;
        for(int i=0; i<3; i++){
            rem=x%10;
            x/=10;
            num+=(rem*(Math.pow(10,cnt)));        
            cnt--;
            if(num==x){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        int num=0; int ans=0;
        for(int i=836; i<1000; i++){
            for(int j=836; j<1000; j++){
                num=i*j;
                if(palindrome(num)){
                    ans=num;
                }
            }
        }
        System.out.println(ans);
    }
    
}
