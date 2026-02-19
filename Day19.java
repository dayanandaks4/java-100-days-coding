//Sort the Array Using Selectio


public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Driver code to test the selection sort implementation
    public static void main(String[] args) {
        int[] data = {7, 4, 10, 8, 3, 1};
        System.out.println("Original array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        
        selectionSort(data);

        System.out.println("\nSorted array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
