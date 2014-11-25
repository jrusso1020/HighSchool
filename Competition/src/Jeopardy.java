/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Jeopardy {
    public static void main(String[] args){
        int input1=0; int input2=0; String line; int num1=0; int num2=0;
        Scanner in= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<Integer>();
        String arr[]= new String[2];
        while(input1!=-1 && input2!=-1){
            line= in.nextLine();
            arr= line.split(" ");
            input1= Integer.parseInt(arr[0]);
            input2= Integer.parseInt(arr[1]);
            list.add(input1);
            list.add(input2);
        }
        list.remove(list.indexOf(input1));
        list.remove(list.indexOf(input2));
        for(int i=0; i<list.size()-1; i+=2){
            for(int j=0; j<list.get(i); j++){
                for(int m=0; m<list.get(i); m++){
                    if(j+m==list.get(i) && m-j==list.get(i+1)){                     
                        num1=m;
                        num2=j;
                        break;
                    }
                }
                if(num1!=0 && num2!=0){
                    break;           
                    }
            }
            if(num1!=0 && num2!=0){
                System.out.println("What are the sum and difference of " + num1 + " and " + num2 + "?");
                num1=0;
                num2=0;
            }
            else if(list.get(i)==list.get(i+1)){
                System.out.println("What are the sum and difference of " + list.get(i) + " and 0?");
            }
            else{
                System.out.println("NOT SO FAST, TREBEKK!");
            }
        }
       
    }
}
