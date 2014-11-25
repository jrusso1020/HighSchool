/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.ArrayList;
import java.util.Random;

public class ArrayList1 {
    public static void main(String[] args){
        int sum=0;
        Random rd= new Random();
        ArrayList<Integer> alist= new ArrayList<Integer>();
        for(int i=0; i<10; i++){
        alist.add(rd.nextInt(10)+1);
        }
        System.out.println("Original Array List: ");
        for(int a: alist){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Number at Index 6: " + alist.get(6));
        alist.remove(3);
        alist.remove(4);
        System.out.println("New Array list: ");
        for(int a: alist){
            System.out.print(a+ " ");
        }
        alist.set(3,1);
        alist.set(4,1);
        System.out.println();
        System.out.println("New Array list: ");
        for(int a: alist){
            System.out.print(a + " ");
        }
        for(int a: alist){
            sum+=a;
        }
        System.out.println("Sum: " + sum);
    }
}
