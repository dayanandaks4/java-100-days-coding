//Using the bubble sort tecnique we approch this problem.....

import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {10,25,65,11,75,12}; // Array is not sorted

        Arrays.sort(arr); // Sort the array using builti-n function

        System.out.println(Arrays.toString(arr));// now its sorted [10, 11, 12, 25, 65, 75]

        int data = 11;  // finding data

        int start = 0; // start index from 0

        int end = arr.length -1 ;//end index arrlen - 1

        // now use while loop bcz we don't know how many times will loop run..
        while(start <= end){
            int mid = (start + end)/2;
            if( data == arr[mid]){
                System.out.println(mid);
                return;
            } else if (data > arr[mid]) {
                start = mid + 1;
            }else  {
                end = mid - 1;
            }
        }System.out.println("Element not found");
    }
}
