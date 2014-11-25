/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author jamesrusso
 */
public class arcTan {
    public static void main(String[] args){
        final double pi=3.14159265358979323846264338327950288419716939937510;
        double sum=0; double tan=0;
        int cnt=0;
        for(double i=1; i<10000000; i+=2){
            if(cnt==0 || cnt%2==0){
                sum+=(1/i);
            }
            else if(cnt%2!=0){
                sum-=(1/i);
            }
            tan=sum*4;
            System.out.println(i + " " + tan);
            cnt++;
        }
    }
}
