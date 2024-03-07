package Array;

import java.util.Arrays;

public class MoveZeroesToEnd {    
    
    public static void MoveZeroesToEnd(int[]arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[]args){
        int[]arr={1,0,2,0,3,0,4,0,5,0};
        Arrays.sort(arr);
        MoveZeroesToEnd(arr);
    }
    
}