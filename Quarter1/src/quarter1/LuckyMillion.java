package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valued User
 */
public class LuckyMillion {
    public static void main(String[] args){
        double amount=0; int count=0;
        System.out.println("Lucky won 1000000 dollars");
        double money =1000000;
        amount+=money;
        while(amount>0){
            count++;
            amount += amount*0.08;
            amount-=(100000);         
        }
        System.out.println("It will take Lucky " + count + " years to empty his account");
        
        
    }
    
}

