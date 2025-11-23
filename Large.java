import java.util.Scanner;
class Large{
    public static void main(String[]args)
    {Scanner ob = new Scanner(System.in);
        int max=0;
        System.out.println("Enter three nos.");
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();

        if(a>b){
            if(a>c)
                max=a;
            else{
                if(c>b)
                max=c;
            }  }
        else{
            if(b>c)
            max=b;
            else
            max=c;
        }
        System.out.println("The largest number of "+a+","+b+"&"+c+"is "+max);
        
        }
    
    }
