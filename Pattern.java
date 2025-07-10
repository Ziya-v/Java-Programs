import java.util.Scanner;
class Pattern{
    void display(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=5;j++){
                if(j%2==0)
                    System.out.print("2");
                else
                System.out.print("1"+"");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Pattern patternobj =new Pattern();
        patternobj.display();
        


    }

}


                
