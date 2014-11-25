package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class PythagoreanTriplets {
    public static void main(String[] args){
       int trip1=0; int trip2=0; int trip3=0; int prod=0;
       for(int a=3; a<750; a++){
           for(int b=4; b<750; b++){
               for(int c=5; c<750; c++){
                   if(((Math.pow(a,2)) + (Math.pow(b,2))==(Math.pow(c,2))) && (a+b+c==1000)){
                       trip1=a;
                       trip2=b;
                       trip3=c;
                       prod=a*b*c;
                   }
               }
           }
       }
        System.out.println( trip1 + " " + trip2 + " " + trip3 + " " + prod);
    }
}
