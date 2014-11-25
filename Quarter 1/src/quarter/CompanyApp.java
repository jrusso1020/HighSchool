package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Employee empArray[]= new Employee[4];
        for(int i=0; i<empArray.length; i++){
            System.out.println("Enter Name: ");
            String a= in.nextLine();
            
            System.out.println("Enter ID: ");
            String b= in.nextLine();
            
            System.out.println("Enter Salary: ");
            int c= Integer.parseInt(in.nextLine());
            
            System.out.println("Enter Bonus: ");
            boolean d= Boolean.parseBoolean(in.nextLine());
            in.nextLine();
            
            empArray[i]= new Employee(a,b,c,d);
        }
        Company myComp= new Company(empArray);
        myComp.printAllEmployees();
        System.out.println("Enter ID to Search For: ");
        String id= in.nextLine();
        myComp.printAnEmployee(myComp.searchEmployees(id));
        
    }
    
}
