// Find Second Largest Elment or num in this array 

import java.util.Arrays;
public class SecondLargestNum {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 2, 3, 6};
        int lentghs = array.length;
        Arrays.sort(array);
        for(int i = lentghs- 2; i>=0; i--){
            if(array[i]!=array[lentghs-1]){
                System.out.println(array[i]); // output : 5
                break;
            }
        }
    }
}
