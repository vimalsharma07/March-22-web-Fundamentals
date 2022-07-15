import java.util.*;
public class Threesum {
    public static void  Two_sum(int[]arr,int target,int lb,int rb,int first_number,int lasttarget){
       while(rb>lb){
        int sum=arr[rb]+arr[lb];
        if(sum==target){
            System.out.println("Its Your answer");
            System.out.println(first_number+"+"+ arr[lb++]+"+"+arr[rb--]);
        } else if(sum>target){
             rb--;
        }else{
            lb++;
        }
       }
    }

    public static void Sum_Array(int[]arr, int n, int target){
        Arrays.sort(arr);
         for(int i=0; i<n; i++){
            Two_sum(arr,target-arr[i],i+1,n-1,arr[i],target);
         }
    }
    public static void main(String[]args){
    
        Scanner scn= new Scanner (System.in);
        int n= scn.nextInt();
        int[]arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("enter your target");
    int target= scn.nextInt();
    Sum_Array(arr,n,target);
    }
}
