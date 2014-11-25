package quarter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James.Russo
 */
public class PythagoreanDate {
    public static void main(String[] args){
        int day; int month; int year;
        for(day=1;day<=29;day++){
            for(month=1;month<=12;month++){
                for(year=0;year<=5;year++){
                    if(Math.pow(year,2)==(Math.pow(day,2) + Math.pow(month,2)) && (year!=0)){
                        System.out.println(day + "/" + month + "/" + year);
                    }
                    else if(Math.pow(day,2)==(Math.pow(year,2) + Math.pow(month,2)) && (year!=0)){
                        System.out.println(day + "/" + month + "/" + year);
                    }
                    else if(Math.pow(month,2)==(Math.pow(day,2) + Math.pow(year,2))&& (year!=0)){
                        System.out.println(day + "/" + month + "/" + year);
                    }
                }
            }
        }
    }
    
    
}
