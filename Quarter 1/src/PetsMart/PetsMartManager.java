/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsMart;

/**
 *
 * @author James.Russo
 */
import java.util.*;
public class PetsMartManager {
    public PetsMartManager(){
        
    }
    public void addPet(ArrayList<Pets> list, Pets p){
        list.add(p);
    }
    public void printAllPets(ArrayList<Pets> list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).toString());
        }
    }
    public Pets searchAllPets(ArrayList<Pets> list, String k, String c){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getKind().equals(k)){
                if(list.get(i).getColor().equals(c)){
                    return list.get(i);
                }
            }
        }
        return null;
    }
    public ArrayList<Pets> sortPets(ArrayList<Pets> list){
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).compareTo(list.get(j))>0){
                    Pets temp=list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
                
            }
        }
        return list;
    }
    public Pets findCheapest(ArrayList<Pets> list){
        Pets cheap=list.get(0);
        for(int i=0; i<list.size(); i++){
            if(list.get(i).compareTo(cheap)<0){
                cheap=list.get(i);
            }
        }
        return cheap;
    }
    public double findAveragePrice(ArrayList<Pets> list){
        double sum=0;
        for(int i=0; i<list.size(); i++){
            sum+=list.get(i).getPrice();
        }
        double avg=sum/list.size();
        return avg;
    }
    public double findTheModePrice(ArrayList<Pets> list){
        sortPets(list);
        int cntMode=0; double mode=0;
        for(int i=0; i<list.size(); i++){
            int count=0;
            for(int j=i+1; j<list.size();j++){
                if(list.get(i).getPrice()==list.get(j).getPrice()){
                    count++;
                }
            }
            if(count>cntMode){
                cntMode=count;
                mode=list.get(i).getPrice();
            }
        }
        return mode;
    }
}
