package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class Animal {
   private String animalName;
   private String typeOfFood;
   
   public Animal(String a, String b){
       this.animalName=a;
       this.typeOfFood=b;
   }
   public String getName(){
       return animalName;
   }
   
   public String getTypeOfFood(){
       return typeOfFood;
   }
   
    @Override
   public String toString(){
       String line=animalName + " " + typeOfFood;
       return line;
   }
}
