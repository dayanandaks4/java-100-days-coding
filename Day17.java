/*This problem is to find two numbers in an integer array that add up to a given target.
We are given an array of integers, and we need to return the indices of the two numbers whose sum equals the target value.
I solved this problem using the brute force approach.
It is not an optimized solution, but when we encounter a new DSA problem, we can initially solve it using the brute force method before optimizing it.*/


public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("The Result is : [" + i + ", " + j + "]");
                    return;   // stops whole program
                }
            }
        }
        System.out.println("No pair found");
    }
}
