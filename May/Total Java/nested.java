
import java.util.Scanner;;


class nested{
    public static void main(String[] args) {
        
    //  for( int i=0; i<4; i++){

    //     for(int j=0; j<3; j++){
    //   System.out.println( i + ""+ j);
    //     }
    //  }
    Scanner scn = new Scanner(System.in);
        int a= scn.nextInt();
        int b=a/3;
        if( b%2==0){
            System.out.println(b);
        

        }
        scn.close();
    }
}
    
