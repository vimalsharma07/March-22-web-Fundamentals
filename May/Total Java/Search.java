import java.util.Arrays;

public class Search {
    public static void main (String[]args){
        int [] arr;
        arr= new int[]{87,66,77,32,13};
        int[]snd;
        snd= new int[]{13,32,44,56,99};
        int count=0;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(i>0 &&arr[i]==arr[i-1]){
                continue;
            }
            for(int j=0; j<snd.length; j++){
                if(arr[i]==snd[j]){
                    count++;

                }

            }
        }
        System.out.println(count);
    }
    
}
