import java.util.HashMap;
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {
        int []arr ={1,2,3,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i< arr.length; i++){
            if( !map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i],map.get(arr[i])+1);
            }

        }
        System.out.println(map.entrySet());
        int maxfreq=2;
        for(var e:map.entrySet()){
            if(e.getValue()>=maxfreq){
                System.out.println(1);
                break;
            }
        }
        System.out.println(0);
    }
}
