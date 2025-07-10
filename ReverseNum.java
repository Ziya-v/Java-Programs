import java.util.Scanner;
class ReverseNum{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a number to reverse");
        int num=in.nextInt();
        int n=num;
        while(n!=0){
            int d=n%10;
            n=n/10;
            sum=sum*10+d;
        }
        System.out.println("The original number is ="+num+'\n'+"The reversed number is="+sum);

    }
}