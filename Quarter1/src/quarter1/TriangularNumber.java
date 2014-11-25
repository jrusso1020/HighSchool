package quarter1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamesrusso
 */
public class TriangularNumber {
    private int number;
    private int triagNum;
    public TriangularNumber(int n){
        this.number=n;
    }
    
    public int computeNumber(){
        for(int i=1; i<=number; i++){
            triagNum+=i;
        }
        return triagNum;
    }
}
