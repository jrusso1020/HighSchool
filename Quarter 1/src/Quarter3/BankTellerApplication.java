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
public class BankTellerApplication {
    public static void main(String[] args) throws IOException{
        Scanner in= new Scanner(System.in);
        ArrayList<BankAccount> list= new ArrayList<BankAccount>();
        Teller tell= new Teller();
        if(tell.checkAccounts()){
            list=tell.getAccounts();
        }
        String input="";
        while(!input.equals("stop")){
            tell.printMenu();
            input=in.nextLine();
            if(input.equals("stop")){
                break;
            }
            if(input.indexOf("a")>-1){
                BankAccount bank;
                bank=tell.createAccount("bank");
                list.add(bank);
            }
            else if(input.indexOf("b")>-1){
                BankAccount save;
                save=tell.createAccount("saving");
                list.add(save);
            }
            else if(input.indexOf("c")>-1){
                int num=tell.readAccountNumber();
                BankAccount act=tell.findAccount(list, num);
                double amt=tell.readAmount();
                act.deposit(amt);
            }
            else if(input.indexOf("d")>-1){
                int num=tell.readAccountNumber();
                BankAccount act=tell.findAccount(list, num);
                double amt=tell.readAmount();
                act.withdraw(amt);
            }
            else if(input.indexOf("e")>-1){
                int num=tell.readAccountNumber();
                SavingAccount act=(SavingAccount)tell.findAccount(list, num);
                act.calculateInterest();
            }
            else{
                int num=tell.readAccountNumber();
                BankAccount act=tell.findAccount(list, num);
                System.out.println(act.toString());
            }

       }
        PrintWriter out= new PrintWriter("BankAcccount.dat");
        String line="";
        for(int m=0; m<list.size(); m++){          
                if(list.get(m).hasInterest()==true){
                    line+="S"+list.get(m).toString();
                }
                else{
                    line+="B"+list.get(m).toString();
                }
                if(m!=list.size()-1){
                    line+=";;";
                }
        }
        out.println(line);
        out.close();
    }
}
