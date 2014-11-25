
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PedalsDirections {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        in.nextLine();
        ArrayList<String[]> list= new ArrayList<String[]>();
        for(int i=0; i<num; i++){
            int length=in.nextInt();
            in.nextLine();
            String arr[]= new String[length];
            for(int j=0; j<length; j++){
                arr[j]=in.nextLine();
            }
            list.add(arr);
        }
        for(int i=0; i<num; i++){
            System.out.println("Course " + (i+1) + ":");
            for(int j=0; j<list.get(i).length; j++)
                if(list.get(i)[j].equals("forward")){
                    System.out.println("1");
                }
                else if(list.get(i)[j].equals("backward")){
                    System.out.println("2");
                        }
                else if(list.get(i)[j].equals("left")){
                    System.out.println("3");
                }
                else if(list.get(i)[j].equals("right")){
                    System.out.println("4");
                }
                else if(list.get(i)[j].equals("rotate left")){
                    System.out.println("5");
                }
                else if(list.get(i)[j].equals("rotate right")){
                    System.out.println("6");
                }
                    
                System.out.println();
            }
        }
    }

