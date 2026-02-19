// Sort the Array Using Selection sort 

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int lengthOfArray = arr.length;

        for (int index = 0; index < lengthOfArray - 1; index++) {
            int minIndex = index;
            for (int j = index + 1; j < lengthOfArray; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("hello");
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
