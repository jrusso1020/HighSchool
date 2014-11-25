package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class ZooManager {
    
    public void feedAnimal(Animal a, Food arrayFood[]){
        for(int i=0; i<arrayFood.length; i++){
            if(a.getTypeOfFood().equals(arrayFood[i].getFoodName())){
                arrayFood[i].decreaseAmount();
            }
        }
    }
    
    public boolean isFoodEmpty(Food arrayFood[]){
        for(int i=0; i<arrayFood.length; i++){
            if(arrayFood[i].getAmount()==0)
                return true;
        }
        return false;
    }
}
