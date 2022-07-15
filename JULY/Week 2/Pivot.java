import java.util.*;

public class Pivot {
    public static int  Return_Index(int[]arr, int n, int target){
        int idx=0;
        for(int i=0; i<n; i++){
            if(arr[i]<=target){
             idx= i;
            
            }

        }
        return idx;
    }

    public static void Print_ID(int[]arr, int n){
        System.out.println("After sorting the Array");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void Swap (int[]arr, int i, int j){
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void Sorted_Array(int[]arr, int n, int target){
        int ptr=-1; int itr=0;
        while(itr<n){
            if(arr[itr]<=target){
               Swap(arr,++ptr,itr++);
            }else{
                itr++;
            }
        }
            
    }
    public static void main(String[]args){

        
      
     Scanner scn= new Scanner (System.in);
    int n= scn.nextInt();
    int[]arr= new int[n];
    for(int i=0; i<n; i++){
        arr[i]=scn.nextInt();
    }
    System.out.println("Enter your target");
    int target= scn.nextInt();
    Sorted_Array(arr,n,target);
    int ans= Return_Index(arr,n,target);
    System.out.println(ans);
    Print_ID(arr, n);
    }
}
