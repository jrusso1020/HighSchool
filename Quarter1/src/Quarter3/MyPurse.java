/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter3;

/**
 *
 * @author jamesrusso
 */
import java.util.ArrayList;

public class MyPurse {
    private ArrayList<String> purse;
    
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
}


