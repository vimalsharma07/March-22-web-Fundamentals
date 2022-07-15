import java.util.*;

public class Select {
    public static void main (String[]args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[]arr;
         arr=new int[n];
         for(int i=0; i<n; i++){
             arr[i] = scn.nextInt();
         }
         System.out.println("Before Sorting The Array");
         for(int i=0; i<n; i++){
             System.out.println(arr[i]);
         }
         System.out.println();
        
           bubble_sort(arr, n);
           System.out.println("After sorting From Bubble sort");
           for ( int i=0; i<n; i++){
               System.out.println(arr[i]);
           }
    }
    public static void sort_array(int[]arr , int n){
        for(int i=0; i<n-1; i++){
            int min_idx=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;

                }


            }
            swap(arr,i,min_idx);
        }


    }
    public static void swap (int[]arr, int i, int min_idx){
      int temp= arr[i];
      arr[i] = arr[min_idx];
      arr[min_idx]=temp;
    }
       public static void bubble_sort(int[]arr, int n){
           for ( int i=0; i<n-1; i++){
               for ( int idx=0; idx<n-1-i;  idx++){
                   if( arr[idx]> arr[idx+1]){
                       swap( arr, idx, idx+1);
                   }
               }
           }

       }
}
