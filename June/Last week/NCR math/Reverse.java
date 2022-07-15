import java.util.*;


public class Reverse {

    public static void change_values (int n, int[]arr){

        for(int i=0; i<n; i++){
            int temp=arr[i];
            arr[i]=i;
            arr[temp]=i;
        }
    }


    public static void reversing_array(int n, int[]arr){
        int i=0;
        int j=n-1;
        while(j>i){
            int temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main (String[]args){

        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int[]arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        reversing_array(n,arr);

        System.out.println("After reversing the Array");
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }

        change_values(n,arr);
        System.out.println("Changing the values");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);

        }
    
}
}

