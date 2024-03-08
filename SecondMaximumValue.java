package Array;

public class SecondMaximumValue {
    
    public static int SecondMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int SecondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                SecondMax=max;
                max=arr[i];
            }
            else if(arr[i]>SecondMax && arr[i]!=max){
                SecondMax=arr[i];
            }
        }
        return SecondMax;
    }
    
    public static void main(String[]args){
        int []arr={1,6,2,5,3,4};
        System.out.println(SecondMax(arr));
    }
    
}