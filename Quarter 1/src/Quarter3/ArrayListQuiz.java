/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
import java.util.*;
public class ArrayListQuiz {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        ArrayList<String> list= new ArrayList<String>();
        list.add("bob"); list.add("bob"); list.add("bob"); list.add("an");
        list.add("alo"); list.add("ehem"); list.add("hem");
        list.add("Joe"); list.add("Jonathan"); list.add("CaroL");
        System.out.println("List:" + list);
        System.out.println("Name at index 2: " + list.get(2));
        System.out.println("Name at index 5: " + list.get(5));
        String old=list.set(2,"NEW NAME");
        System.out.println("Old name at index 2: " +old);
        System.out.println("New list: " + list);
        System.out.println("Enter Target Name: ");
        String tar= in.nextLine();
        int index=list.indexOf(tar);
        if(index>=0){
            System.out.println("Index of Target Name: " + index);
        }
        else{
            System.out.println("The Target not Found.");
        }
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    String temp=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Sorted List: " +list);
        for(int i=list.size()-1; i>=0; i--){
            while(list.indexOf(list.get(i))!=i){
                list.remove(list.indexOf(list.get(i)));
            }
        }
        System.out.println("Removed Duplicate list: " + list);
        for(int i=0; i<list.size(); i++){
            String a=list.get(i).toUpperCase();
            list.set(i, a);
        }
        System.out.println("Upper case list: " + list);
        System.out.println("Names that Start with C: ");
        for(int i=0; i<list.size(); i++){
            if(list.get(i).indexOf("C")==0){
                System.out.println(list.get(i));
            }
        }
        int length=list.get(0).length();
        int indexL=0;
        for(int i=1; i<list.size(); i++){
            if(list.get(i).length()>length){
                length=list.get(i).length();
                indexL=i;
            }
        }
        System.out.println("Longest Name: " + list.get(indexL));
        for(int i=0; i<list.size(); i++){
            String rev="";
            for(int j=0; j<list.get(i).length(); j++){
                rev=list.get(i).substring(j,j+1)+rev;
            }
            list.set(i,rev);
        }
        System.out.println("List reversed: " + list);
        for(int i=0; i<list.size(); i++){
            String rev="";
            for(int j=0; j<list.get(i).length(); j++){
                rev=list.get(i).substring(j,j+1)+rev;
            }
            rev=rev.substring(rev.length()-2);
            list.set(i,rev);
        }
        System.out.println("List with just 2 letters: " + list);
        String arr[][]= new String[3][4];
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i==0 || i%2==0){
                    arr[i][arr[i].length-1-j]=list.get(cnt);
                }
                else{
                    arr[i][j]=list.get(cnt);
                }
                if(list.size()-1==cnt){
                    break;
                }
                cnt++;
            }
            if(list.size()-1==cnt){
                    break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println();
            for(int j=0; j<arr[i].length; i++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
