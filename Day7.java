import java.util.Scanner;

class Calculator {
    int firstNum;
    int secondNum;
    String operator;

    void display() {
        System.out.println("\nWelcome To Calculator...");
        System.out.println("Addition ---> + ");
        System.out.println("Subtraction ---> - ");
        System.out.println("Multiplication ---> * ");
        System.out.println("Division ---> / ");
        System.out.println("Power ---> pow ");
        System.out.println("Exit ---> stop");
    }

    void add() {
        System.out.println("Sum: " + (firstNum + secondNum));
    }

    void subtract() {
        System.out.println("Difference: " + (firstNum - secondNum));
    }

    void multiply() {
        System.out.println("Product: " + (firstNum * secondNum));
    }

    void divide() {
        if (secondNum != 0) {
            System.out.println("Division: " + (firstNum / secondNum));
        } else {
            System.out.println("Division by zero is not allowed");
        }
    }

    void power() {
        System.out.println("Power: " + (int) Math.pow(firstNum, secondNum));
    }

    void exit() {
        System.out.println("Thank you for using the calculator!");
    }
}
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            calc.display();

            System.out.print("Enter operation: ");
            calc.operator = sc.next();

            // STOP FIRST
            if (calc.operator.equalsIgnoreCase("stop")) {
                calc.exit();
                break;
            }

            // TAKE NUMBERS ONLY IF NOT STOP
            System.out.print("Enter first number: ");
            calc.firstNum = sc.nextInt();

            System.out.print("Enter second number: ");
            calc.secondNum = sc.nextInt();

            // OPERATIONS
            if (calc.operator.equals("+")) {
                calc.add();
            } else if (calc.operator.equals("-")) {
                calc.subtract();
            } else if (calc.operator.equals("*")) {
                calc.multiply();
            } else if (calc.operator.equals("/")) {
                calc.divide();
            } else if (calc.operator.equals("pow")) {
                calc.power();
            } else {
                System.out.println("Invalid operation!");
            }
        }

        sc.close();
    }
}
