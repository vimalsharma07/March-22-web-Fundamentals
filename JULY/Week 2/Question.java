import java.util.*;

public class Question {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,6,};
        int [] brr= { 3,7,8,9};
      int[] ans= mergeTwoSortedArrays(arr,brr);
      for(int i=0; i<ans.length; i++){
        System.out.print(ans[i]+" ");
      }
    }
    public static int[] mergeTwoSortedArrays(int[] A, int[] B) {
        int n = A.length, m = B.length;
        if (n == 0 || m == 0)
            return n != 0 ? A : B;

        int len = n + m;
        int[] ans = new int[len];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(A[i]>=B[j]){
                ans[k++]=B[j++];
            }else{
                ans[k++]=A[i++];
            }
        }

        while(i < n){
        ans[k++]=A[i++];
        }

        while(j < m){
ans[k++]=B[j++];
        }

        return ans;

    }

}