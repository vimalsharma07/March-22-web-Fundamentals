
import java.util.*;

public class Zeroone {
    public static void main(String[]args){

         Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int arr[];
        arr= new int[n];
        for (int i=0; i<n; i++){
            arr[i]= scn.nextInt();
            
        }
        System.out.println("Your array");

        for(int i=0; i<n; i++ ){
            System.out.println(arr[i]);

        }
        zero_one_sorting(arr,n);
        System.out.println("After sorting");
        for(int l=0; l<n; l++){
            System.out.println(arr[l]);

        }

    }
    public static void zero_one_sorting(int[]arr,int n){
        int i=-1;
        int j=0;
        while(j<n){
            if(arr[j]==0){
                i++;
                swap(arr,i,j);
                j++;
            }
            else{
                j++;
            }
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
