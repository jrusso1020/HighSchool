package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Student object = new Student();
        String stu[][]= new String[4][4];
        for(int i=0; i<stu.length-1; i++){
            if(i==0){
                System.out.println("Enter Names: ");
            }
            else if(i==1){
                System.out.println("Enter Genders: ");
            }
            else if(i==2){
                System.out.println("Enter GPA: ");
            }
            for(int j=0; j<stu[i].length; j++){
                stu[i][j]= in.nextLine();
            }
        }
        for(int i=0; i<stu[0].length; i++){
            String m=stu[2][i];
            int x= Integer.parseInt(m);
        }
    }
    
}
