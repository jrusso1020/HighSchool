package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author james.russo
 */
import java.util.Scanner;

public class BasicGenetics {
    public static void main(String[] args){
        String str = ""; String line=""; String line2=""; int num=0; int sum=0; int sum2=0; int cnt=0; int num2=0; int length=0;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int x= in.nextInt();
        in.nextLine();
        String lines[] = new String[x];
        for(int i=0; i<x; i++){
            System.out.println("Enter Line:");
            lines[i]= in.nextLine();
        }
        for(int i=0; i<x; i++){
            line=lines[i];
            sum=0;
            num=0;
            cnt=0;
            num2=0;
            if(line.indexOf("A")!=-1 || line.indexOf("C")!=-1 || line.indexOf("G")!=-1 || line.indexOf("T")!=-1){
                for(int j=0; j<line.length(); j++){
                    if(line.substring(j,(j+1)).equals("A")){
                        sum+=(0*(Math.pow(10,(line.length()-1-j))));
                    }
                    if(line.substring(j,(j+1)).equals("C")){
                        sum+=(1*(Math.pow(10,(line.length()-1-j))));
                    }
                     if(line.substring(j,(j+1)).equals("G")){
                        sum+=(2*(Math.pow(10,(line.length()-1-j))));
                    }
                      if(line.substring(j,(j+1)).equals("T")){
                        sum+=(3*(Math.pow(10,(line.length()-1-j))));
                      }
                }
                while(sum>0){
                num=sum%10;
                sum2+=(num*(Math.pow(4,cnt)));
                num2+=sum2;
                sum2=0;
                sum=sum/10;
                cnt++;
                }
                System.out.println("Sequence #" + (i+1) + ": " +num2);
            }
            else{
                sum = Integer.parseInt(line);
                    while(sum>0){
                        num=sum%4;
                        sum2+=(num*(Math.pow(10,cnt)));
                        num2+=sum2;
                        sum2=0;
                        sum=sum/4;
                        cnt++;
                    }
                    length = (int)(Math.log10(num2)+1);
                    
                    for(int j=0; j<length; j++ ){
                        if(num2%10==0){
                            str ="A" + str;
                        }
                        else if(num2%10==1){
                            str ="C" + str;
                        }
                        else if(num2%10==2){
                            str="G" + str;
                        }
                        else if(num2%10==3){
                            str="T" + str;
                        }
                        num2=num2/10;
      
                    }
                    
                    System.out.println("Sequence #" +(i+1) + ": " + str);
            }
            }
        }
        
    }
    

