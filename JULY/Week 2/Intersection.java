public class Intersection {

    public static void main(String[] args) {
        int[]arr={1,2,4,5,6,};
        int [] brr= { 3,7,8,9};
       mergeTwoSortedArrays(arr,brr);
    } 
    public static void mergeTwoSortedArrays(int[] A, int[] B) {
        int n = A.length, m = B.length;
        if (n == 0 || m == 0){
            System.out.println("Kuch bhi nhi");
        }
        
        
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(A[i]>B[j]){
                
                j++;
            }else if(A[i]<B[j]){
                i++;
            } else if(A[i++]==B[j++]){
                System.out.println(A[i]);
            }
        }

        

    }

}
    

