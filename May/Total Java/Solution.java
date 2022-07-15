import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int arr[];
        arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt();
            
        }
        System.out.println("Your Array");
        for(int i=0; i<n; i++ ){
            System.out.println(arr[i]);
        }
        sort_zero_one(arr,n);

        System.out.println("Your Array After sorting");
        for(int i=0; i<n; i++ ){
            System.out.println(arr[i]);
        }
        
    }

    public static void sort_zero_one(int[] arr, int n){
        int i=-1;
        int j=0;

        while(j<n){
            if(arr[j]==0){
                i++; // increasing zeros' area
                swap(arr,i,j);
                j++;
            } else { // increasing ones' area
                j++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j){
        int tempa=arr[i];

        arr[i]=arr[j];
        arr[j]=tempa;
    }
}