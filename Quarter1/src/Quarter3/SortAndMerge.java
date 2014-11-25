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
import java.util.Collections;

public class SortAndMerge {
    private ArrayList<Integer> list;
    
    public SortAndMerge(ArrayList<Integer> b){
        list=b;
    }
    public void sort(ArrayList<Integer> a){
        Collections.sort(list);
    }
    public void removeDuplicate(ArrayList<Integer> a){
        for(int i=list.size()-1; i>=0; i--){
            if(list.indexOf(list.get(i))!=i){
                list.remove(i);
            }
        }
    }
    public ArrayList<Integer> Merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> merged= new ArrayList<Integer>();
        for(int i=0; i<a.size(); i++){
            merged.add(a.get(i));
        }
        for(int i=0; i<b.size(); i++){
            merged.add(b.get(i));
        }
        Collections.sort(merged);
        for(int i=merged.size()-1; i>=0; i--){
            if(merged.indexOf(merged.get(i))!=i){
                merged.remove(i);
            }
        }
        return merged;
    }
}
