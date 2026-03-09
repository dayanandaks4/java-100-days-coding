// Sum of two numbers using a static method
// Static methods can be called without creating an object

public class Arithmetic {

    static int getSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static void invoke() {
        int result = getSum(10, 20);
        System.out.println("Sum of two numbers: " + result);
    }

    public static void main(String[] args) {
        invoke();
    }
}




import java.util.Scanner;

public class Arithmetic {

    static int getSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = getSum(a, b);

        System.out.println("Sum: " + result);
    }
}
