package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class Company {
    private Employee arr[]= new Employee[4];
    public Company(Employee a[]){
        this.arr=a;
    }
    
    public void printAllEmployees(){
        for(int i=0; i<arr.length; i++){
            arr[i].computeSalary();
            arr[i].printInfo();
        }
    }
    public Employee searchEmployees(String id){
        for(int i=0; i<arr.length; i++){
            if(id.equals(arr[i].getId())){
                return arr[i];
            }
        }
        return null;
    }
    public void printAnEmployee(Employee e){
         e.printInfo();
            
        }   
}
