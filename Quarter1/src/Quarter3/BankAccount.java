/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
public class BankAccount {
    private int accountNumber;
    private Customer person;
    private double balance;
    
    public BankAccount(int x, Customer y, double z){
        accountNumber=x;
        person=y;
        balance=z;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public Customer getCustomer(){
        return person;
    }
    public double getBalance(){
        return balance;
    }
    public String toString(){
        return accountNumber+ "-"+ person.toString() + "-"+ balance;
    }
    public void deposit(double amt){
        balance+=amt;
    }
    public void withdraw(double amt){
        if(balance>=amt){
            balance-=amt;
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    public boolean hasInterest(){
        return false;
    }
}
