import java.util.*;

public class Array {
    public static void main(String args[]) {
     Scanner scn= new Scanner(System.in);
     int n= scn.nextInt();
     int arr[];
     arr= new int[n];
     for( int i=0; i<n; i++){
         arr[i]=scn.nextInt();
     }
    //  for( int i=n-1; i>=0; i--){
    //      System.out.println(arr[i]);

    //      int var= arr[i];
    //      if( var%2==0){
    //          System.out.println(var +"index is "+ i);
    //      }


    //  }
    int ods=0;
    int evs=0;

    for( int i=0; i<n; i++){
        int var=arr[i];
        if(var%2==0){
            ods= ods+var;
        }
        else{
            evs= evs+var;
        }
        System.out.println(ods-evs);
    }
     
    }
}