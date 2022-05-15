import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);  // Create a Scanner object

    int marks = scn.nextInt(); 
    if(marks >= 90){
      System.out.println("Excelent");

    } else if(marks>=80){
      System.out.println("Nice dude");

    }else if(marks>=70){
      System.out.println("Avrage");

    } else if(marks>=60){
      System.out.println("you should go better");

    } else if ( marks>50){
      System.out.println("Go for Extra classes");

    }else{
      System.out.println("work hard");

     }
    
  

    scn.close();
  }
}
