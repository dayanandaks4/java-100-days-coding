public class ReverseString {
    public static void main(String[] args) {

        String name = "Daya";

        // Convert string to char array
        char[] arr = name.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];   // store first value
            arr[start] = arr[end];    // assign last to first
            arr[end] = temp;          // assign temp to last

            start++;
            end--;
        }

        // Convert array back to string
        String reversed = new String(arr);
        System.out.println(reversed);
    }
}