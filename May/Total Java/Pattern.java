import java.util.Scanner;

public class Pattern {
    public static void main(String args[]) {
        Scanner scn= new Scanner (System.in);
        int n= scn.nextInt();
        int spaces =0;
        int star=n;
        for( int lines=1; lines<=2*n; lines++){
            for( int i=1; i<=star; i++){
                System.out.print("* ");
            }
            for( int j=0; j<spaces; j++){
                System.out.print(" ");
                
            }
            for(int k=1; k<=star; k++){
                System.out.print( "* ");
            }
        
        System.out.println();
       
   
      if( lines<n){
          star--;
          spaces= spaces+4;
      } else if( lines==n){
          
      }
     
      else {
          star++;
          spaces= spaces-4;
      }
     
    }
    
}
}