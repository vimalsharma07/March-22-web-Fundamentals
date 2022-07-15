// import java.util.*;

public class Mayth{
    public static class Max{
     double Maxi(double a, double b){
        System.out.println("Hii I am Double");
        if(a>b){
            return a;
        }
        return b;
    }
     float Maxi(float a, float b){
        System.out.println("Hii i am Float");
        if(a>b){
            return a;
        }
        return b;
    }
}
    public static void main (String[]args){
        double a=(double) 23.67;
        double b= (double)24.89;
        Max ans= new Max();
        System.out.println(ans.Maxi(a, b));
    }

}