/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author jamesrusso
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SortAndMergeTest {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<Integer>();
        SortAndMerge object= new SortAndMerge(list);
        System.out.println("Enter Numbers for list, enter -1 to end: ");
        int num=in.nextInt();
        while(num!=-1){
            list.add(num);
            System.out.println("Enter Numbers for list, enter -1 to end: ");
            num=in.nextInt();
        }
        object.sort(list);
        System.out.println(list);
        object.removeDuplicate(list);
        System.out.println(list);
        ArrayList<Integer> list2= new ArrayList<Integer>();
        SortAndMerge object2= new SortAndMerge(list2);
        System.out.println("Enter Numbers for list2, enter -1 to end: ");
        num=in.nextInt();
        while(num!=-1){
            list2.add(num);
            System.out.println("Enter Numbers for list2, enter -1 to end: ");
            num=in.nextInt();
        }
        object2.sort(list2);
        object2.removeDuplicate(list2);
        System.out.println(object.Merge(list, list2));    
    }
}
