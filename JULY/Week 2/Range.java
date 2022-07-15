import java.util.*;

public class Range{

    private static Scanner scn=new Scanner (System.in);
    public static void  Prefix(int[]arr){
        int n= arr.length;
        int [] prr=new int[n+1];
        for(int i=0; i<n; i++){
            prr[i+1]=prr[i]+arr[i];
        }
int q=scn.nextInt();
while(q-->0){
    int lr=scn.nextInt();
    int rr=scn.nextInt();
    int sum=prr[rr]-prr[lr-1];
    System.out.println("Your sum is");
    System.out.println(sum);
    
}

    }
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,4,6,7,8,9,0,2,33,4,44,55};
        Prefix(arr);
    }
}