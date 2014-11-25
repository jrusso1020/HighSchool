package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class Employee {
    private String name;
    private String id;
    private int salary;
    private boolean bonus;
    public Employee(String a, String b, int c, boolean d){
        this.name=a;
        this.id=b;
        this.salary=c;
        this.bonus=d;
    }
    public void setName( String n){
        name=n;
    }
    public void setId( String y){
        id=y;
    }
    public void setSalary( int x){
        salary=x;
    }
    public void setBonus( boolean w){
        bonus=w;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public boolean getBonus(){
        return bonus;
    }
    public void computeSalary(){
        if(bonus==true){
            salary+=2000;
        }
    }
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
    
}
