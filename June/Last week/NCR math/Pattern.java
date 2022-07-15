import java.util.*;


public class Pattern{

    public static void Boundry(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static  void Star_pattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i+j==n-1 || i==j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
    public static void main (String[]args){
        Scanner scn= new Scanner (System.in);
        int n= scn.nextInt();
        Star_pattern(n);
        Boundry(n);
    }
}