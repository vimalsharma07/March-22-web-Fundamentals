
    import java.io.*;
import java.util.*;

public class Solution {
    public static void Swap(int[]arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        int n= scn.nextInt();
        int[]arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        int i=0; int j=i+1;
        while(j>n){
            if(arr[i]==0 && arr[j]!=0){
                Swap(arr,i,j);
                i++;
                j++;
            }else if (arr[i]==0&& arr[j]==0){
                j++;
            } else if(arr[i]!=0 && arr[j]!=0 || arr[j]==0 && arr[i]!=0){
                i++;
                j++;
            } 
        }
        for(int z=0; z<n; z++){
         System.out.print(arr[z]+" ");
        }
    }
}
    

