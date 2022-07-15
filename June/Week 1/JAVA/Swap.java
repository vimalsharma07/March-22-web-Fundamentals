import java.util.*;

public class Swap {
    public static void main(String[]args){
        Scanner scn = new Scanner (System.in);
        int n= scn.nextInt();
        int[]arr;
        arr=new int[n];

        
        for( int i=0;i<n; i++){
            arr[i]= scn.nextInt();
        

        }

        System.out.println("Your array is in the below line");
        for( int i=0;i<n; i++){
        System.out.println(arr[i]);

        }

    }
    
}
