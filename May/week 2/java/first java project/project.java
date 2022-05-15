import java.util.Scanner;

class project {
 public static void main(String[] args) {
     Scanner scn= new Scanner(System.in);
     int usernumber=0;
     int mynumber =((int)(Math.random()*100));

     do{
         System.out.println("Guess a number between 1-100");
         usernumber=scn.nextInt();
         if(mynumber==usernumber){
             System.out.println("woow Your guessing is Great");
             break;
         }
         else if(usernumber>mynumber){
             System.out.println("Your Number is bigger");
             
         }
         else{
             System.out.println("Your Number is smaller");
         }
         
         
  
         
     }
     while(usernumber>=0);
     System.out.print("numer was");
     System.out.println(mynumber);
     scn.close();

   
    }
    

}