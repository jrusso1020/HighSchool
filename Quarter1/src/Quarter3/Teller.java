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
import java.io.*;
public class Teller{
    Scanner in= new Scanner(System.in);
    public boolean checkAccounts(){
       return new File("BankAcccount.dat").exists();
    }
    public ArrayList<BankAccount> getAccounts() throws IOException{
        ArrayList<BankAccount> list= new ArrayList<BankAccount>();
        Scanner amadeus= new Scanner(new File("BankAcccount.dat"));
        String line=amadeus.nextLine();
        String arr[]=line.split(";;");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            if(line.substring(0,1).equals("S")){
                line=line.substring(1);
                String x[]=line.split("-");
                int num=Integer.parseInt(x[0]);
                String name=x[1];
                String address=x[2];
                String phone=x[3];
                int age=Integer.parseInt(x[4]);
                Customer customer= new Customer(name, address, phone, age);
                double balance= Double.parseDouble(x[5]);
                double interestRate=Double.parseDouble(x[6]);
                SavingAccount save= new SavingAccount(num,customer,balance,interestRate );
                list.add(save);
            }
            else{
                line=line.substring(1);
                String x[]=line.split("-");
                int num=Integer.parseInt(x[0]);
                String name=x[1];
                String address=x[2];
                String phone=x[3];
                int age=Integer.parseInt(x[4]);
                Customer customer= new Customer(name, address, phone, age);
                double balance= Double.parseDouble(x[5]);
                BankAccount bank= new BankAccount(num,customer,balance);
                list.add(bank);
            }
        }
        return list;
    }
    public void printMenu(){
        System.out.println("a) to create a BankAccount\n"
                + "b) to create a SavingAccount"
                + "\nc) to deposit"
                + "\nd) to withdraw"
                + "\ne) to calculateInterest of a SavingAccount"
                + "\nf) to print all the info of an account ");
    }
    public BankAccount createAccount(String account){
        System.out.println("Enter Name:");
        String name=in.nextLine();
        System.out.println("Enter Address:");
        String address=in.nextLine();
        System.out.println("Enter Phone:");
        String phone=in.nextLine();
        System.out.println("Enter Age:");
        int age=in.nextInt();
        in.nextLine();
        Customer cust= new Customer(name, address, phone, age);
        if(account.indexOf("Bank")>-1 || account.indexOf("bank")>-1){
            System.out.println("Enter Account Number:");
            int number=in.nextInt();
            in.nextLine();
            System.out.println("Enter Balance:");
            double balance=in.nextDouble();
            in.nextLine();
            BankAccount bank=new BankAccount(number, cust, balance);
            return bank;
        }
        else{
            System.out.println("Enter Account Number:");
            int number=in.nextInt();
            in.nextLine();
            System.out.println("Enter Balance:");
            double balance=in.nextDouble();
            in.nextLine();
            System.out.println("Enter Interest Rate:");
            double rate= in.nextDouble();
            in.nextLine();
            SavingAccount save= new SavingAccount(number, cust, balance, rate);
            return (BankAccount)save;
        }
    }
    
    public int readAccountNumber(){
        System.out.println("Enter Account Number:");
        int num=in.nextInt();
        in.nextLine();
        return num;
    }
    
    public double readAmount(){
        System.out.println("Enter Amount:");
        double amount=in.nextDouble();
        in.nextLine();
        return amount;
    }
    
    public BankAccount findAccount(ArrayList<BankAccount> list, int accountNum){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getAccountNumber()==accountNum){
                return list.get(i);
            }
        }
        return null;
    }
    
}
