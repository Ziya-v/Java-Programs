import java.util.Scanner;
public class Pali{
    public static void main(String[]args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=ob.nextLine();
        if(isPalindrome(str)){
            System.out.println("The string is palindrome");}
            else{
            System.out.println("The string is not palindrome");}
            ob.close();}
            public static boolean isPalindrome(String s){
                int l=0;
                int r=s.length();
                while(l<r){
                    if(s.charAt(l)!=s.charAt(r)){
                        return false;

                    }
                    l++;r--;
                    
                }
                return true;
            }
        }
    
