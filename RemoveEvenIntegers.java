package Array;

public class RemoveEvenIntegers {
    
    public static void main(String[]args){
        int[]arr={3,2,4,7,10,6,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        int[]arr2=new int[count];
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr2[idx]=arr[i];
                idx++;
            }
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    
}