import java.util.Scanner;
public class casecheck{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=ob.next().charAt(0);
        //to check if the character is upper or lower case
        while(Character.isLetter(ch)==true){
        boolean c=Character.isUpperCase(ch);
        if(c==true)
        System.out.println("The character is an Capital letter.");
        else
        System.out.println("The character is a Small letter.");
        break;
          }
          while(Character.isLetter(ch)==false){System.out.println("Not an alphabet enter again");break;}
        ob.close();

    }
}