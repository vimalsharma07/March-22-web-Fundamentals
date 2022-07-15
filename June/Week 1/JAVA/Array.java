
import java.util.*;

public class Array{
     public static void main (String[]args){
         Scanner scn= new Scanner(System.in);
         int n= scn.nextInt();
         int[]arr;
         arr=new int[n];
         for ( int i=0; i<n; i++){
             arr[i]= scn.nextInt();

         }
         System.out.println(" Before Reversing the Array");
         for(int i=0; i<n; i++){
             System.out.println(arr[i]);
         }
         System.out.println();

         System.out.println("After Reversing the Array");
         reverse_array(arr,n);
         for( int i=0; i<n; i++){
             System.out.println(arr[i]);
             
         }
         System.out.println("fill the target");
       
         

            

         }
         public static void  reverse_array(int[]arr, int n){

            for( int i=0; i<n/2; i++){
                int temp=arr[i];
                arr[i]=arr[n-1-i];
                arr[n-1-i]=temp;
            }

     }

     
    }
 