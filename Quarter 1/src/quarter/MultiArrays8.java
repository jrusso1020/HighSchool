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

public class MultiArrays8 {
    public static void zigzag( int a[][]){
        int index=0; int x=0; int y=0;
        int b[] = new int[a.length*a[0].length];
        while(x*y<=b.length){
            if(x==0 && y==0){
                b[index]= a[x][y];
                y++;
            }
            else if((x-1)<0 && x%2==0){
                b[index]= a[x][y];
                y++;
            }
            else if((x-1)<0 && x%2!=0){
                b[index]= a[x][y];
                x++;
                y--;
            }
            else if((y-1)<0 && y%2!=0){
                b[index]= a[x][y];
                x++;
            }
            else if((y-1)<0 && y%2==0){
                b[index]= a[x][y];
                x--;
                y++;
            }
            else{
                b[index]= a[x][y];
                x--;
                y++;
            }
            System.out.print(b[index]);
            index++;
        }
        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of Rows:");
        int x = in.nextInt();
        System.out.println("Enter Number of Columns:");
        int y = in.nextInt();
        int arr[][] = new int[x][y];
        for( int i=0; i<arr.length; i++){
            System.out.println("Enter Row" + (i+1) + " :");
            for( int j=0; j<arr[i].length; j++){
                arr[i][j]= in.nextInt();
            }
        }
        zigzag(arr);
    }
    
}
