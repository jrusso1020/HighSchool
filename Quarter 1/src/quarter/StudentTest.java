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

public class StudentTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Student arr[]= new Student[4];
        for(int i=0; i<arr.length; i++){

                System.out.println("Enter Name: ");
                String n = in.nextLine();

                System.out.println("Enter Gender: ");
                String g = in.nextLine();
     
                System.out.println("Enter GPA: ");
                double gp = in.nextDouble();
                in.nextLine();
      
                arr[i]= new Student(n,g,gp);  
            }
       for(int i=0; i<arr.length; i++){
           arr[i].printInfo();
       }
       for(int i=0; i<arr.length; i++){
           arr[i].gpaAdd();
       }
       for(int i=0; i<arr.length; i++){
           arr[i].printInfo();
       }
    }
    
}
