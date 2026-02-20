import java.util.Arrays;

public class InsertionSortExample {

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        // Insertion Sort Logic
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];      // Current element
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;  // Insert key at correct position
        }

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
