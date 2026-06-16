import java.util.*;
public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int N = in.nextInt();
        System.out.println("Enter a number");
        int opt = in.nextInt();
        int sum = N;
        for(int i =1; i<N; i++){
            if(opt == 1){
                if(i % 2 != 0)
                sum =sum - (N-i);
                else 
                sum =sum + (N-i);

            }
            if( opt == 2){
                if(i % 2 != 0)
                sum =sum + (N-i);
                else 
                sum =sum - (N-i);


            }
           
        }
         System.out.println(sum);
    }
    
}
