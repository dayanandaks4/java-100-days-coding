import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 12};
        int target = 9;
        int needed = 0;
        Map<Integer,Integer> Map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            needed = target - arr[i];
            if(Map.containsKey(needed)){
                System.out.println("[" +Map.get(needed) + ","+ i +"]");
                return;
            }
            Map.put(arr[i],i);
        }
    }
}
