package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
import java.util.Scanner;
public class ZooApplication {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ZooManager manager= new ZooManager();
        Animal animalArray[]= new Animal[4];
        animalArray[0]= new Animal("tiger", "chicken");
        animalArray[1]= new Animal("leopard", "chicken");
        animalArray[2]= new Animal("bear", "fish");
        animalArray[3]= new Animal("elephant", "sugarcane");
        
        Food foodArray[]= new Food[3];
        foodArray[0]= new Food("chicken", 10);
        foodArray[1]= new Food("fish", 10);
        foodArray[2]= new Food("sugarcane", 10);
        
        System.out.println(animalArray[0].toString() + ": to feed enter 0");
        System.out.println(animalArray[1].toString() + ": to feed enter 1");
        System.out.println(animalArray[2].toString() + ": to feed enter 2");
        System.out.println(animalArray[3].toString() + ": to feed enter 3");
        
        while(!manager.isFoodEmpty(foodArray)){
            System.out.println("Enter Number of Animal to Feed: ");
            int i= in.nextInt();
            int m;
            manager.feedAnimal( animalArray[i], foodArray);
            System.out.println(foodArray[0].toString());
            System.out.println(foodArray[1].toString());
            System.out.println(foodArray[2].toString());
        }
    }
    
}

