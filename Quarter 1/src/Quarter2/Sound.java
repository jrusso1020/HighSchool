/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
public class Sound {
    private int samples[];
   public Sound(int arr[]){
       this.samples=arr;
   }
    
    public int limitAmplitude(int limit){
        int cnt=0;
        if(limit>=0){
        for(int i=0; i<samples.length; i++){
            if(samples[i]>limit){
                samples[i]=limit;
                cnt++;
            }
            else if(samples[i]<-limit){
                samples[i]=-limit;
                cnt++;
            }
        }
        return cnt;
        }
        else{
        return 0;
        }
    }
    
    public void trimSilenceFromBeginning(){
        int index=0;
        for(int i=0; i<samples.length; i++){
            if(samples[i]!=0){
                index=i;
                break;
            }
        }
        int length= samples.length-index;
        int arr[]= new int[length];
        for(int i=index; i<samples.length; i++){
            int j=0;
            arr[j]=samples[i];
            j++;
        }
        samples= new int[length];
        for(int i=0; i<arr.length; i++){
            samples[i]=arr[i];
        }
    }
}
