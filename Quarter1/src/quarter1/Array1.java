package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class Array1 {
    public static void main(String[] args){
        int a[]={3, 5, 7, 9, 2, 4, 6, 8, 15, 30};
        System.out.println("5th number:" + a[4]);
        System.out.println("9th number:" + a[8]);
        for(int x=0;x<a.length;x++)
            System.out.println((x+1)+ ": " + a[x]);
    }
    
}

