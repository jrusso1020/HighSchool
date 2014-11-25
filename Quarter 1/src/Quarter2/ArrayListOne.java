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

public class ArrayListOne {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> list= new ArrayList<String>();
        for(int i=0; i<5; i++){
            System.out.println("Enter Name: ");
            list.add(in.nextLine());
        }
        for(String a: list){
            System.out.print(a + " ");
        }
        list.add(2, "rames");
        System.out.println();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("Contains Jonny: " + list.contains("Jonny"));
        list.clear();
    }
}
