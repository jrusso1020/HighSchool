package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class Student {
    private String name;
    private String gender;
    private Double gpa;
    private String grade;
    public void computePassFail(){
        if(gpa>7.0){
            grade="pass";
        }
        else{
            grade="fail";
        }
    }
    
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
    }
    
}
