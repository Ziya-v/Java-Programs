import java.util.Scanner;
class loop{
    public static void main(String []args){
       
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number of digits to be printed");
       
        int num=ob.nextInt();
        System.out.println(" ");
        for(int k=1; k<=num;k++){System.out.println(k);}
        // to print in same line
        for(int j=1; j<=num;j++){System.out.print(j);
        }
        System.out.println("");

        //while loop
        int h=1;
        while(h<=num){
    
            System.out.println(h);h++;}
            

            /*do while loop */
            int l=1;
            do { 
               
                System.out.println(l);
                l++;
                
            } while (l<=num);
        }

        }
    

