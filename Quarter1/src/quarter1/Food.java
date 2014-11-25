package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class Food {
    private String foodName;
    private int amount;
    
    public Food(String a, int b){
        this.foodName=a;
        this.amount=b;
    }
    
    public String getFoodName(){
        return foodName;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void decreaseAmount(){
        amount--;
    }
    
    @Override
    public String toString(){
        String line= foodName + " " + amount;
        return line;
    }
}
