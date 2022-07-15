
import java.util.*;

public class Test{


   
       public static void main(String args[]) {
        Scanner scn= new Scanner (System.in);
        int a= scn.nextInt();
        int stars=a;
        int spaces=0;
        for( int line=0; line<a; line++){
           
            for(int i=0; i<spaces; i++){
                System.out.print(" "); 
            }


            for(int j=0; j<stars; j++){
                System.out.print("*");

            }
            
            System.out.println();
           spaces++;
           stars--;
        }
        scn.close();
       }
   }
