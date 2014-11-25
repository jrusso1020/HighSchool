/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
public class Part {
    private String partNo;
    private String color;
    private String price;
    
    public Part(String a, String b, String c){
        this.partNo=a;
        this.color=b;
        this.price=c;
    }
    
    public String getPartNo(){
        return partNo;
    }
    @Override
    public String toString(){
        String y= partNo + " " + color + " " + price;
        return y;
    }
    
    public boolean equals(Part a){
        if(partNo.equals(a.getPartNo())){
            return true;
        }
        else{
            return false;
        }
    }
}
