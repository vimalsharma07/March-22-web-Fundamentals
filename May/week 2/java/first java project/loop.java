
import java.util.Scanner;
class loop{

    public static void main(String[]args) {

Scanner scn= new Scanner(System.in);
   int n= scn.nextInt();
   for( int i=0; i<n; i++){

    int a= scn.nextInt();
    int b= scn.nextInt();

    if( i%2==0){
        System.out.println(a+b);
    }
    else{
        System.out.println(a*b);
    }

   }
     scn.close();   
    }
 }