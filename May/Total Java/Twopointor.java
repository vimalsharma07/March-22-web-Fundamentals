import java.util.Arrays;

public class Twopointor {
    public static void main(String[]args){
        int[]arr=new int[]{1,3,4,6,7,2,5};
        int target=9;
        // sumkaha(arr,target);
        // int evert=sumkaha(arr,target);
        // System.out.println(evert);
        threesum(arr,target);
        int three_number =threesum(arr,target);
        System.out.println(three_number);

    }
   public static int threesum (int[]arr,int target){
    int n= arr.length;
    int count=0;


    for(int k=0; k<arr.length-2; k++){
        int i=k+1;
        Arrays.sort(arr);
        int j=n-1;
      int   required_sum = target-arr[k];
        while(j>i){
             if(required_sum== arr[i]+arr[j]){

                count++;
                i++;
                j--;

             }
             else if(required_sum > arr[i]+arr[j]){
              i++;
             }
             else{
                j--;
             }
        }
    }
    return count;
   }




    public static int sumkaha(int[]arr, int target){
        int i=0;
        int n =arr.length;
     int count =0;
     Arrays.sort(arr);
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                count++;
                j--;
                i++;
            }
            
            else if(arr[i]+arr[j]<target){
                
                
                i++;
            }
            else{
                j--;
            }


        }
        return count;

    }
    
}
