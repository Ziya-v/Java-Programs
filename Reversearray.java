import java.util.*;
public class Reversearray{
    public static void main(String[] args)
        {
            int[] arr = {23,5,46,70,12};
          
            reverse(arr);
            System.out.println(Arrays.toString(arr));

        }
       public static void reverse(int[] arr){
            int start = 0;
            int end=arr.length-1;
            while(start<end)
            {
                swap(arr,start,end);
                start++;
                end--;

            }

        }
        public static void swap(int[]arr,int index1,int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]= temp;
        }
    }
