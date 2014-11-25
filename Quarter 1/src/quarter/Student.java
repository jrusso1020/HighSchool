package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class Student {
    private String name;
    private String gender;
    private Double gpa;
    private String grade;
    public Student(String name, String gender, Double gpa){
        this.name=name;
        this.gender=gender;
        this.gpa=gpa;
        computePassFail();
    }
    public void computePassFail(){
        if(gpa>7.0){
            grade="pass";
        }
        else{
            grade="fail";
        }
    }
    public void gpaAdd(){
        gpa+=1;
        computePassFail();
    }
    
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);
    }
    
}
