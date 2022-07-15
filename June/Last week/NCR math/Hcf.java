import java.util.*;

public class Hcf {

    public static int Highest_common(int a, int b){
        int gcd=1;
        for(int i=1; i<=a || i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static int Lcm(int ans , int a, int b){


        int lowest= (a/ans)*b;
        return lowest;
    }
    public static void  main(String[]args) {
        Scanner scn= new Scanner (System.in);
        int a= scn.nextInt();
        int b= scn.nextInt();
     int ans=   Highest_common(a,b);
     System.out.println( "HCf is "+ans);
       int l= Lcm(ans,a,b);
        System.out.println("Lcm is"+l);
        
    }
    
}
