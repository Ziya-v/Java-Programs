import java.util.Scanner;
class Temperature{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Double c,f;
        System.out.println("Enter temperature in celsius");
        c=in.nextDouble();
        f=c*9/5+32;
        System.out.println("Enter temperature in Fahrenheit"+f);


    }
}