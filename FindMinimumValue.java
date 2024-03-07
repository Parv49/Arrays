package Array;

public class FindMinimumValue {
    
    public static void MinValue(int[]arr,int min){
        for(int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    
    public static void main(String[]args){
        int[]arr={1,2,-9,3,4,-2,0};
        MinValue(arr,0);
    }
    
}