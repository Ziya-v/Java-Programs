import java.util.*;
public class MaxDigit {
    public int Digit(int[] nums){
        int flag = 0;
        int max = nums[0];
        for(int i = 0;i<nums.length; i++){
            int num = nums[i];
            int count = 0;
            while(num != 0){
                num = num/2;
                count++;
            }
        if(count>flag){
            max = nums[i];
            flag = count;

        }
       

        }
         return max;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int l = obj.nextInt();
        int[] nums = new int[l];
        System.out.println("Enter the array");
        for(int i = 0;i < l;i++){
            nums[i] = obj.nextInt();

        }
        MaxDigit o = new MaxDigit();
        int v = o.Digit(nums);
        System.out.println(v);

    }
    
}
