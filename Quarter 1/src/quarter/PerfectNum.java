package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class PerfectNum {
    public static void main(String[] args){
        double sum=0; double num; double count;
        for(num=1;num<=1000;num++){
            sum=0;
            for(count=1;count<num;count++){
                   if(num%count==0){
                       sum+=count;
                   }
            }
            if(sum==num)
                   System.out.println(num);     
        }
    }   
}
