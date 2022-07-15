import java.util.*;


public class Sorting {
    public static void main (String[] args){
    Scanner scn= new Scanner( System.in);
    int n= scn.nextInt();
    int [] arr;
    arr= new int[n];
    for (int i=0; i<n; i++){
        arr[i]= scn.nextInt();
        
    }
     System.out.println("Before sorting the Array");
    for( int i=0; i<n; i++){
        System.out.println(arr[i]);

    }
    System.out.println();
    selection_sort(arr,n);
    System.out.println("After sorting the array");
    for( int i=0; i<n; i++){
        System.out.println(arr[i]);

    }

    
}
public static void selection_sort(int[]arr, int n){

     for ( int i=0; i<n-1; i++){
         int idx=i;
         for ( int j=i+1; j<n; j++){
             if(arr[j] < arr[idx]){
                 idx=j;
             }
         }
        swaping(idx,i,arr);  
     }

}
public static void swaping( int idx, int i, int[]arr){
    int temp=arr[i];
    arr[i]=arr[idx];
    arr [idx]=temp;
}
}
