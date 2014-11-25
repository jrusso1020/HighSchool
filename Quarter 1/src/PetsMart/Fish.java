/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsMart;

/**
 *
 * @author James.Russo
 */
public class Fish extends Pets{
    private String kindOfWater;
    
    public Fish(){
        
    }
    
    public Fish(String a, String b, String c, double d, String e){
        super(a, b, c ,d);
        kindOfWater=e;
    }
    public int checker(){
        return 1;
    }
    
    public String toString(){
        return super.toString() + "-" + kindOfWater;
    }
}
