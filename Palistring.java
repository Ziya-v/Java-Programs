import java.util.Scanner;
public class Palistring{
    public static void main(String[] args){
    String str;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a string");
    str = obj.nextLine();
    System.out.println(isPali(str));
    }
    public static boolean isPali(String str){
        str=str.toLowerCase();
        if( str == null || str.length() == 0 ){
            return true;
        }
        for(int i = 0; i <= str.length() / 2; i++ ){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end) {
                return false;

            }
        }
        return true;
    }
}