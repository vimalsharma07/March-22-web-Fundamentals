
import java.util.*;

public class Ncr{
  

    public static int Factorial(int p){
      int ans=1;
        for(int i=p; i>=1; i-- ){
       ans= ans*i;
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner scn= new Scanner (System.in);
       int n= scn.nextInt();
       int r= scn.nextInt();
       int lst=n-r;
       int a= Factorial(n);
       int b= Factorial(r);
       int c= Factorial(lst);
      int last_ans= a/(b*c);
       System.out.println(last_ans);
    }
}
