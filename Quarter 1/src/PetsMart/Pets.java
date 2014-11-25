/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsMart;

/**
 *
 * @author James.Russo
 */
public class Pets implements Comparable{
    private String kind;
    private String name;
    private String color;
    private double price;
    
    public Pets(){
        
    }
    public Pets(String x, String y, String z, double b){
        kind=x; 
        name=y;
        color=z;
        price=b;
    }
    public String getKind(){
        return kind;
    }
    public void setKind(String a){
        kind=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String a){
        name=a;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String a){
        color=a;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double a){
        price=a;
    }
    public int checker(){
        return -1;
    }
    public String toString(){
        return kind+"-"+ name + "-"+ color + "-" + price;
    }
    public int compareTo(Object o){
        Pets a=(Pets)o;
        if(price!=a.getPrice()){
            return (int)(price-a.getPrice());
        }
        else{
            return name.compareTo(a.getName());
        }
    }
}
