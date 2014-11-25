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

public class StudentGrade {
    public static void main(String[] args){
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter grades, Enter -1 to end:");
        int grade = in.nextInt();
        int count = 0;
        while(grade!=-1){
            sum+=grade;
            count++;
            System.out.println("Enter grade, Enter -1 to end:");
            grade = in.nextInt();                   
        }
        int average = sum/count;
        if(average>=90){
            System.out.println("Final Grade: A");
        }
        else if(average>=80){
            System.out.println("Final Grade: B");
    }
        else if(average>=70){
            System.out.println("Final Grade: C");
        }
        else if(average>=60){
            System.out.println("Final Grade: D");
        }
        else{
            System.out.println("Final Grade: F");
        }
    }
    
}

