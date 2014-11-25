package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valued User
 */
import java.util.Scanner;

public class ApExam {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Exam Type:");
        String test = in.nextLine();
        System.out.println("Enter Score Earned:");
        int score = in.nextInt();
        if(test.equalsIgnoreCase("a") && score>=60){
            System.out.println("Exam A: Score 5");
        }
        else if(test.equalsIgnoreCase("a") && score>=50){
            System.out.println("Exam A: Score 4");
        }
        else if(test.equalsIgnoreCase("a") && score>=40){
            System.out.println("Exam A: Score 3");
        }
        else if(test.equalsIgnoreCase("a") && score>=30){
            System.out.println("Exam A: Score 2");
        }
        else if(test.equalsIgnoreCase("a") && score<=29){
            System.out.println("Exam A: Score 1");
        }
        else if(test.equalsIgnoreCase("ab") && score>=70){
            System.out.println("Exam AB: Score 5");
        }
        else if(test.equalsIgnoreCase("ab") && score>=60){
            System.out.println("Exam AB: Score 4");
        }
        else if(test.equalsIgnoreCase("ab") && score>=50){
            System.out.println("Exam AB: Score 3");
        }
        else if(test.equalsIgnoreCase("ab") && score>=40){
            System.out.println("Exam AB: Score 2");
        }
        else if(test.equalsIgnoreCase("ab") && score<=39){
            System.out.println("Exam AB: Score 1");
        }
        else{
            System.out.println("Bad input");
        }
            
    }
    
    
}
