import java.util.Scanner;
public class Condition{
    public static void main(String []args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary=ob.nextInt();
        if(salary>=50000)
            System.out.println("Salary is \t"+(salary+5000));
        else
        System.out.println("salary is\t"+(salary+2000));


    }

}