/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
public class SavingAccount extends BankAccount {
    private double interestRate;
    
    public SavingAccount( int x, Customer y, double z, double a){
        super(x,y,z);
        interestRate=a;
    }
    public double getInterestRate(){
        return interestRate;
    }
    public String toString(){
        return super.toString() + "-" + interestRate;
    }
    
    public void calculateInterest(){
        super.deposit(super.getBalance()*interestRate);
    }
    public void withdraw(double amt){
        if(amt>=1000){
            super.withdraw(amt);
        }
    }
    public boolean hasInterest(){
        return true;
    }
}
