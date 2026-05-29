import java.util.*;
public class BinarySearch{
public static void main(String[] args) {
    Scanner obj =new Scanner(System.in);
    
    System.out.println("Enter the length of the sorted array");
    int n=obj.nextInt();
    int[] ar =new int[n];
    System.out.println("Enter the array");
    for(int i=0;i<n;i++){
        ar[i]=obj.nextInt();
    }
    System.out.println("Enter the number to be searched");
    int num=obj.nextInt();
System.out.println(search(ar, 0, n-1, num));

}
static int search(int ar[], int s, int e, int target){
    if(s > e){
        return -1;
    }
   int m = s + (e - s)/2;
   if(ar[m] == target){
    return m;

   }
   if(target < ar[m]){
     return search( ar, s, m-1, target);
   }

return search(ar,m+1,e, target);

}

 }
    

