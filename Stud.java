import java.util.Scanner;
    class Stud{
    public static void main(String[]args)
    {Scanner ob = new Scanner(System.in);
        int b,roll;
        String n,branch; 
        char sec ;
        System.out.println("Enter your name");
        n=ob.nextLine();
        System.out.println("Enter your Section");
        sec=ob.next().charAt(0);
        System.out.println("Enter your Batch");
        b=ob.nextInt();
        System.out.println("Enter your last three digit of enrollement no.");
        roll=ob.nextInt();
        System.out.println("Enter your Branch");
        branch=ob.next();

        System.out.println("Name "+n);
        System.out.println("Section "+sec);
        System.out.println("Batch "+b);
        System.out.println("Enrollment "+roll);
        System.out.println("Branch "+branch);


        ob.close();
        
        
        }
    
    }