public class ArmstrongNumber {

    public static void main(String[] args) {

        int number = 153;
        int originalNumber = number;

        int digitCount = 0;
        int sum = 0;

        int temp = number;
        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }

        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp = temp / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
