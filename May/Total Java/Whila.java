import java.util.*;

public class Whila{
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
        int i=0;
        int j=n-1;
        while(j>i){
            
            

                int temp= arr[i] ;
                arr[i] =arr[j] ;
                arr[j] = temp;         
     
                 i++;
                 j--;
            
          
            }
            System.out.println("after sorting");
            for(int k=0; k<n; k++){
                System.out.println(arr[k]);
            }
          
        }


    }
