

import java.util.*;

public class Palendrom{


    public static void is_foldable(int n, int[]arr){
        int i=0;
        int j=n-1;
        int count=0;
        while(j>i){
            if(arr[i]==arr[j]){
               i++;
               j--; 
            }
            else{
                count++;

            }
        }
        if(count==0){
            System.out.println("Yes its foldable");
        }
        else{
            System.out.print("Not");
        }

    }
    public static void main (String[]args){

        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[]arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        is_foldable(n,arr);
    }
}