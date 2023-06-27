import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class sumOfIndexes {
    public static void main(String[] args) {
        int[]arr= { 2,3,1,5,7};
        int target=10;
        HashMap<Integer, Integer>twosum= new HashMap<>();
        int []ans = {-1};
        for(int i=0; i<arr.length; i++){
            //
            // int []ans = {-1};
            int partner = target-arr[i];
            if(twosum.containsKey(partner)){
                ans=new int[]{i, twosum.get(partner)};
            }
            else{
                twosum.put(arr[i],i);
            }


        }
        System.out.println(Arrays.toString(ans));
    }

}
