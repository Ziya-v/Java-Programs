import java.util.Scanner;
class Leet258{
public static void main(String[] args) {
    
Scanner obj=new Scanner(System.in);
    int num;
    System.out.println("Enter a number");
    num=obj.nextInt();
        int numx=num;int count=0,sum=0;
        while(numx!=0){
            count++;
            numx=numx/10;
         }
          
        numx=num;
        for(int i=0;i<count;i++){
      
        while(numx!=0){
            numx=numx/10;
           sum=sum +(numx%10);
           
            
        }
    numx=sum;
}
System.out.println(numx);}}
   

