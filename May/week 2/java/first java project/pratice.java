import java.util.Scanner;


class pratice{
     public static void main (String[]args){
        
        Scanner scn =new Scanner(System.in);
         int n=scn.nextInt();
         for(int i=2;i<=n; i++){
           boolean isprime=true;
           for(int factor=2; factor<=(i-1); factor++){
               if(i%factor==0){
                   isprime=false;
               }
               

           }
             if(isprime==true){
                 System.out.println(i);
             }
           }
             scn.close();
         }
         

     }


