/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
import java.util.Scanner;

public class MazeApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Dynamic Size of Array: ");
        int x= in.nextInt();
        int a[][]= new int[x][x];
        Maze object= new Maze(a);
        object.printMaze();
    }
}
