import java.util.*;

public class Product_three {
    public static int Max_pair(int[]arr,int lb, int rb){
        if(rb-lb+1<2){
            return Integer.MIN_VALUE;
        }
        int num1= arr[rb]*arr[rb-1];
        int num2= arr[lb]*arr[lb+1];
        int max_num=Math.max(num1, num2);
        return max_num;
    }

    public static int Multiply_three(int[]arr, int n){
      int max_ans=Integer.MIN_VALUE; 
      Arrays.sort(arr);
        for(int i=n-1; i>=0; i--){
            int num=arr[i];
            int answer= Max_pair(arr,0,i-1);
            max_ans=Math.max(max_ans, num*answer);
        }
        return max_ans;
    }
     public static void main(String[]args){
        Scanner scn= new Scanner (System.in);
        int n= scn.nextInt();
        int[]arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
     int ans=   Multiply_three(arr,n);
     System.out.println(ans);
     }
}
