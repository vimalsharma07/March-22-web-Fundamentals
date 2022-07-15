import java.util.*;


public class Even {
    public static void main( String[]args){
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();
        int arr[];
        arr= new int[n];
        for( int i=0; i<n; i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(" printing bro");
        for( int i=n-1; i>=0; i--){
            System.out.println(arr[i]);
        }
        System.out.println(" wait and watch");
        for( int i=0; i<n; i++){
          int var = arr[i];
           if(var %2==0){
               System.out.println(var + "position" +i);
              var +=var;
              System.out.println(var);
           }

        }
       
    }
    
}
