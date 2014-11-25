/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsMart;

/**
 *
 * @author James.Russo
 */
public class AnimalPet extends Pets {
    private String sound;
    public AnimalPet(){
        
    }
    public AnimalPet(String x, String a, String b, double c, String d){
        super(x,a,b,c);
        sound=d;
    }
    public int checker(){
        return 0;
    }
    public String toString(){
    return super.toString() + "-" + sound;
    
    }
}
