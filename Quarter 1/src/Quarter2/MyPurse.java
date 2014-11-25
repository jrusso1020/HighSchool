/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.ArrayList;

public class MyPurse {
    private ArrayList<String> purse;
    final private int quarter=25; 
    final private int dime=10; 
    final private int nickel=5;
    final private int penny=1;
    
    MyPurse(ArrayList<String> a)
    {
        purse = a;
    }
    
    public void addCoin(String coinName){
        purse.add(coinName);
    }
    public ArrayList<String> getPurse(){
        return purse;
    }
    
    @Override
    public String toString(){
        String y= "Purse(";
        for(int i=0; i<purse.size(); i++){
            y+=purse.get(i);
            if(i!=0 || i!=purse.size()-1){
                y+=",";
            }
        }
        y+=")";
        return y;
    }
    
    public void reverse(){
        for(int i=0; i<purse.size()/2; i++){
            String temp=purse.get(i);
            purse.set(i, purse.get(purse.size()-1-i));
            purse.set(purse.size()-1-i, temp); 
        }
    }
    
    public boolean sameCoins(MyPurse other){
        if(purse.size()==other.getPurse().size())
        {
        for(int i=0; i<purse.size()-1; i++){
            for(int j=0; j<purse.size(); j++){
                if(purse.get(i).compareTo(purse.get(j))>0){
                    String temp=purse.get(i);
                    purse.set(i, purse.get(j));
                    purse.set(j, temp);
                }
                if(other.getPurse().get(i).compareTo(other.getPurse().get(j))>0){
                    String temp=other.getPurse().get(i);
                    other.getPurse().set(i, other.getPurse().get(j));
                    other.getPurse().set(j, temp);
                }
            }
        }
        for(int i=0; i<purse.size(); i++){
            if(!purse.get(i).equals(other.getPurse().get(i))){
                return false;
            }
        }
        return true;
        }
        else{
            return false;
        }
    }
    
    public int getValue(){
        int value=0; 
        for(int i=0; i<purse.size(); i++){
            if(purse.get(i).equalsIgnoreCase("quarter")){
                value+=quarter;
            }
            else if(purse.get(i).equalsIgnoreCase("dime")){
                value+=dime;
            }
            else if(purse.get(i).equalsIgnoreCase("nickel")){
                value+=nickel;
            }
            else if(purse.get(i).equalsIgnoreCase("penny")){
                value+=penny;
            }
        }
        return value;
    }
    
    public int compareTo(MyPurse n){
        int sum=0; int num1=0; int num2=0;
        for(int i=0; i<purse.size(); i++){
            if(purse.get(i).equalsIgnoreCase("quarter")){
                num1+=quarter;
            }
            else if(purse.get(i).equalsIgnoreCase("dime")){
                num1+=dime;
            }
            else if(purse.get(i).equalsIgnoreCase("nickel")){
                num1+=nickel;
            }
            else if(purse.get(i).equalsIgnoreCase("penny")){
                num1+=penny;
            }
        }
        for(int i=0; i<n.getPurse().size(); i++){
            if(n.getPurse().get(i).equalsIgnoreCase("quarter")){
                num2+=quarter;
            }
            else if(n.getPurse().get(i).equalsIgnoreCase("dime")){
                num2+=dime;
            }
            else if(n.getPurse().get(i).equalsIgnoreCase("nickel")){
                num2+=nickel;
            }
            else if(n.getPurse().get(i).equalsIgnoreCase("penny")){
                num2+=penny;
            }
        }
        sum= num1-num2;
        return sum;
    }
}



