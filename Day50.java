// It might be look like simple code why he written this ?? but it Essenetial to learn!!
// In oops without creating a object we a invoking method and printing the out put...
// how its possible ?? the sol is we used static keyword to do this..
//In java by using static meathod without creating obj additonl without main(another class) we can invoke a method any where?

import java.util.Scanner;
class Addition{
     static int getSum(int firstNumber , int secondNumber){
         int sumOfTwo = firstNumber + secondNumber;
         return sumOfTwo;
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the First number : ");
         int fn = sc.nextInt();
         System.out.print("Enter the Second number : ");
        int sn = sc.nextInt();
        int result = getSum(10, 20);
        System.out.println("Sum of two number : " + result);
    }
}
