import java.util.Scanner;
public class ques3Array {
    public static void main(String[] args) {
        int [] arr= { 1, 3, 5, 6};
        int low=0;
        int target=5;
        int high= arr.length-1;

        while(low<=high){
            int mid=low+(high-low);
            if(arr[mid]== target){
                System.out.println(mid);
                return;
            }
            else if(target>arr[mid]){
                low= mid+1;
            }
            else{
                high= mid-1;
            }
        }
        System.out.println(low);
    }
}
