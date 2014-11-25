/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author James.Russo
 */
public class Customer {
    private String name;
    private String address;
    private String phone;
    private int age;
    
    public Customer(String a, String b, String c, int d){
        name=a;
        address=b;
        phone=c;
        age=d;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return name+ "-" + address + "-"+ phone + "-"+ age;
    }
}
