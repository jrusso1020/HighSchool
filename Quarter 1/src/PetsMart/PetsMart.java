/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PetsMart;

/**
 *
 * @author James.Russo
 */
import java.io.*;
import java.util.*;

public class PetsMart {
    public static void main(String[] args) throws IOException{
        Scanner in= new Scanner(System.in);
        ArrayList<Pets> pets= new ArrayList<Pets>();
        PetsMartManager manage= new PetsMartManager();
        
        if(new File("PetsMart.dat").exists()){
            Scanner amadeus=new Scanner(new File("PetsMart.dat"));
            String full=amadeus.nextLine();
            String arr[]= full.split(";;");
            for(int s=0; s<arr.length; s++){
                Pets df=null;
                if(arr[s].substring(0,1).equals("F")){
                    String part=arr[s].substring(1);
                    String der[]=part.split("-");
                    String kind=der[0];
                    String name=der[1];
                    String color=der[2];
                    double price=Double.parseDouble(der[3]);
                    String water=der[4];
                    df=(Fish)df;
                    df=new Fish(kind, name, color, price, water);
                }
                else if(arr[s].substring(0,1).equals("A")){
                    String part=arr[s].substring(1);
                    String der[]=part.split("-");
                    String kind=der[0];
                    String name=der[1];
                    String color=der[2];
                    double price=Double.parseDouble(der[3]);
                    String sound=der[4];
                    df=(AnimalPet)df;
                    df=new AnimalPet(kind, name, color, price, sound);
                }
                else if(arr[s].substring(0,1).equals("P")){
                    String part=arr[s].substring(1);
                    String der[]=part.split("-");
                    String kind=der[0];
                    String name=der[1];
                    String color=der[2];
                    double price=Double.parseDouble(der[3]);
                    df=new Pets(kind, name, color, price);
                }
                manage.addPet(pets, df);
        }
        }
        System.out.println("a) to add pet to the petMart"
                + "\nb) to print the info of each pet in the petMart"
                + "\nc) to search for a pet (based on kind and color)"
                + "\nd) to sort all the Pets in increasing order of prices"
                + "\ne) to find the Pet with the cheapest price"
                + "\nf) to find the average price of a pet in the store"
                + "\ng) to find the mode of all of the Pets’ prices"
                + "\nh) Stop");
        String input=in.nextLine();
        while(!input.equals("h")){
            Pets x = null;
            switch (input){
                case "a":
                    System.out.println("Is is a pet, animalPet, or Fish:");
                    String pet= in.nextLine();
                    System.out.println("Enter kind of pet:");
                    String kind=in.nextLine();
                    System.out.println("Enter name of pet:");
                    String name=in.nextLine();
                    System.out.println("Enter color of pet:");
                    String color=in.nextLine();
                    System.out.println("Enter price of pet:");
                    Double price=in.nextDouble();
                    in.nextLine();
                    if(pet.equals("animalPet")){
                        System.out.println("Enter sound of pet:");
                        String sound=in.nextLine();
                        x=(AnimalPet)x;
                        x= new AnimalPet(kind, name, color, price, sound);
                    }
                    else if(pet.equals("Fish")){
                        System.out.println("Enter kind of water:");
                        String water=in.nextLine();
                        x=(Fish)x;
                        x= new Fish(kind, name, color, price, water);
                    }
                    else{
                        x= new Pets(kind, name, color, price);
                    }
                    manage.addPet(pets, x);
                    break;
                case "b":
                    manage.printAllPets(pets);
                    break;
                case "c":
                    System.out.println("Enter kind to search:");
                    String a= in.nextLine();
                    System.out.println("Enter color to search:");
                    String b= in.nextLine();
                    System.out.println(manage.searchAllPets(pets, a, b));
                    break;
                case "d":
                    manage.sortPets(pets);
                    break;
                case "e":
                    System.out.println("Cheapest Pet: " + manage.findCheapest(pets));
                    break;
                case "f":
                    System.out.println("Average Price of Pets: " + manage.findAveragePrice(pets));
                    break;
                case "g":
                    System.out.println("Mode: " + manage.findTheModePrice(pets));
                    break;
            }
            System.out.println("a) to add pet to the petMart"
                + "\nb) to print the info of each pet in the petMart"
                + "\nc) to search for a pet (based on kind and color)"
                + "\nd) to sort all the Pets in increasing order of prices"
                + "\ne) to find the Pet with the cheapest price"
                + "\nf) to find the average price of a pet in the store"
                + "\ng) to find the mode of all of the Pets’ prices"
                + "\nh) Stop");
            input=in.nextLine();
        }
        PrintWriter out= new PrintWriter("PetsMart.dat");
        String line="";
        for(int m=0; m<pets.size(); m++){          
                if(pets.get(m).checker()==1){
                    line+="F"+pets.get(m).toString();
                }
                else if(pets.get(m).checker()==0){
                    line+="A"+pets.get(m).toString();
                }
                else if(pets.get(m).checker()==-1){
                    line+="P"+pets.get(m).toString();
                }
                if(m!=pets.size()-1){
                    line+=";;";
                }
        }
        out.println(line);
        out.close();
    }
}

