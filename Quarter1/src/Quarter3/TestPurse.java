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

public class TestPurse {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Number of Purses: ");
        int numPurse=in.nextInt();
        MyPurse arr[]= new MyPurse[numPurse];
        for(int i = 0; i < arr.length; i++)            
        {
            ArrayList<String> l = new ArrayList<String>();
            arr[i] = new MyPurse(l);
        }
            
        for(int i=0; i<numPurse; i++){
            String coin;
            for(int j=0; j<1000; j++){
                System.out.println("Enter Coins or enter none to stop: ");
                coin= in.nextLine();
                if(coin.equalsIgnoreCase("none")){
                    break;
                }
                arr[i].addCoin(coin);
            }
        }
        for(int i=0; i<numPurse; i++){
            System.out.println(arr[i].toString());
            arr[i].reverse();
            System.out.println("Reversed");
            System.out.println(arr[i].toString());
        }
        System.out.println("Enter Index of Purse 1 to check: ");
        int index1=in.nextInt();
        System.out.println("Enter Index of Purse 2 to check: ");
        int index2= in.nextInt();
        System.out.println("Purse" + index1 + " and Purse" + index2 + " have the same index: " + arr[index1].sameCoins(arr[index2]));
    }
}
