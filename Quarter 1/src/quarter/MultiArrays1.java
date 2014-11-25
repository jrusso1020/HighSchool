package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;

public class MultiArrays1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Teams:");
        int team= in.nextInt();
        System.out.println("Enter Number of Games:");
        int game= in.nextInt();
        int arr[][]= new int[game][team];
        for(int i =0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter Team" + (j+1) + " Score for Game" + (i+1) + ":");
                arr[i][j]= in.nextInt();
            }
        }
        System.out.println("  \tTeam1\tTeam2\tTeam3\tTeam4\tTeam5");
        for(int i=0; i<arr.length; i++){
            System.out.print("G" + (i+1));
            for(int j=0; j<arr[i].length; j++){
                System.out.print("\t" + arr[i][j]);
            }
            System.out.println();
            
        }
    }
    
}
