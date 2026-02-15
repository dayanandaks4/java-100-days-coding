// Sort the array Element Using Bubble Sort.. 


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] unSortedList = {70,8,3,13};
        int temp = 0;
        for(int i = 0; i<unSortedList.length-1; i++){
            boolean didswap = false;
            for (int j = 0; j<unSortedList.length-i-1 ;j++){
                if (unSortedList[j] > unSortedList[j+1]){
                    didswap = true;
                    temp = unSortedList[j+1];
                    unSortedList[j+1] = unSortedList[j];
                    unSortedList[j] = temp;
                }
            }if (didswap == false) {
                break;
            }
        }System.out.println("The Sorted List is : " + Arrays.toString(unSortedList));
    }
}
// OUTPUT : The Sorted List is : [3, 8, 13, 70]
