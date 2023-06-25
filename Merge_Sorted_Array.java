import java.util.Arrays;
import java.util.Scanner;
public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int []arr1={ 1,2,3};
        int []arr2={ 2,5,6};
        int p1= arr1.length-1;
        int p2= arr2.length-1;
        int[]arr3=new int[p1+p2];
        int p= p1+p2-1;
        for(int i=p; p>=0; p--){
            if(p2<0){
                return;
            }
            if(arr1[p1]>arr2[p2]){
                arr3[p]=p1;
                p1--;

            }
            else{
                arr3[p]=arr2[p2];
                p2--;
            }
        }
        System.out.println(Arrays.toString(arr3));

    }
}
