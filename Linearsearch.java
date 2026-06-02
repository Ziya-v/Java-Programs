import java.util.Scanner;
class Linearsearch{
    public int seq_search(int arr[],int e){
        int r=0;
        for(int i=1;i<10;i++)
        {
        if(arr[i]==e)
        r =1;
        else{
        r = -1;}

    }
return r;
}
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            int[] a= new int[10];
            int val;int x;
            System.out.println("Enter an array");
            for(int i=0;i<10;i++){
                
                a[i]=in.nextInt();
                
            }
            System.out.println("Enter value to search");
            val=in.nextInt();
            
            Linearsearch ob=new Linearsearch();
            x=ob.seq_search(a,val);
            if(x==1)
                System.out.println("Item found");
            else
                System.out.println("Item not found");
        }
    }}
    