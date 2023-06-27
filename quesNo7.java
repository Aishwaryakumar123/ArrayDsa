import java.util.Arrays;
import java.util.Scanner;
public class quesNo7 {
    public static void main(String[] args) {
        int []nums= { 3,0,1,0,2,2};
        int left =0;
        int right=0;
        while(right<nums.length){
            if(nums[right]!=0){
                int temp= nums[left];
                nums[left]= nums[right];
                nums[right]= temp;
                        left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
