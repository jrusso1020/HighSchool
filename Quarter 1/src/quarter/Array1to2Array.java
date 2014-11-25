package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.Random;
import java.util.Scanner;

public class Array1to2Array {
    public static boolean check(int x, int a[]){
        boolean flag=true;
        for(int n=0; n<a.length; n++){
            if(a[n]==x){
                flag=false;
            }
        }
        return flag;
    }
    public static void main(String[] args){
        int numb=0; 
        Random rd= new Random();
        Scanner in = new Scanner(System.in);
        String arr[]= new String[9];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter Name: ");
            arr[i]= in.nextLine();
        }
        int num[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1};
        String name[][]= new String[3][3];
        for(int i=0; i<name.length; i++){
            for(int j=0; j<name[0].length; j++){
                numb = rd.nextInt(9);
                while(!check(numb, num)){
                    numb=rd.nextInt(9);
            }
                name[i][j]= arr[numb];
                num[numb]=numb;
            }
        }
        for(int i=0; i<name.length; i++){
            for(int j=0; j<name[0].length; j++){
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
