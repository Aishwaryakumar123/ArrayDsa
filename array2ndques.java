import java.util.Arrays;

public class array2ndques {
    public static void main(String[] args) {
        int nums[]= {3,2,2,3};
        int val=3;
        int left=0;int count=0;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[left] = nums[i];
                left++;
                count++;
            }
            // return count;
        }
        System.out.println(count);
    }

}
