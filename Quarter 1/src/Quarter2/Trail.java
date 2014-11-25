/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quarter2;

/**
 *
 * @author James.Russo
 */
public class Trail {
    private int markers[];
    
    public Trail(int arr[]){
        this.markers=arr;
    }
    
    public boolean isLevelTrailSegment(int start, int end){
        boolean flag=false; int max=0; int min;
        for(int i=start; i<=end; i++){
            if(markers[i]>max){
                max=markers[i];
            }
        }
        min=max;
        for(int i=start; i<=end; i++){
            if(markers[i]<min){
                min=markers[i];
            }
        }
        int diff=max-min;
        if(diff<=10){
            flag=true;
        }
        return flag;

    }
    
    public boolean isDifficult(){
        int cnt=0;
        int arr[]= new int[markers.length-1];
        for(int i=0; i<markers.length-1; i++){
            arr[i]=markers[i]-markers[i+1];
            if(arr[i]<0){
                arr[i]=-arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=30){
                cnt++;
            }
        }
        if(cnt>=3){
            return true;
        }
        else{
            return false;
        }
    }
}
