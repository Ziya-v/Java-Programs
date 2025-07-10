import java.util.Scanner;

public class largest{
    public static void main(String []args){
        Scanner ob=new Scanner(System.in);
        int max;
        System.out.println("Enter three numbers one by one");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
       
          /*   if(a>b && a>c)
            max=a;
            if(b>a && b>c)
            max=b;
            else 
            max=c;*/
            max=a;
            if(b>max)
            max=b;
            if(c>max)
            max=c;

        System.out.println(max+" is the largest number");


        
    }
}