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
import java.util.Scanner;

public class ArrayList4 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            System.out.println("Enter Integer: ");
            list.add(in.nextInt());
        }
        System.out.println(list);
        for(int i=0; i<list.size()-1; i++){
            for(int j=(i+1); j<list.size(); j++){
                if(list.get(i)>list.get(j)){
                    int temp= list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
        for(int i=0; i<list.size()-1; i++){
            for(int j=(i+1); j<list.size(); j++){
                if(list.get(i)==list.get(j)){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}
