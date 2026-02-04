
//Check the  Largest number in a integer array..

public class FindLargnum {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 2, 3};
        int largest_value = array[0];
        for(int x : array) {
            if (largest_value < x) {
                largest_value = x;
            }
        }
        System.out.println("The Largest Number is :  " + largest_value);
    }
}
