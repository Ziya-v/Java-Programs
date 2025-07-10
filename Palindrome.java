import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        int sum=0,d,num;
        String x;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to check if its palindrome");
        num=in.nextInt();
        int n=num;
        while(n>0){
            d=n%10;
            n=n/10;
            sum=sum*10+d;
        }
        if(sum==num)
        x="true";
        else
        x="false";
        System.out.println(x);
        }
    }