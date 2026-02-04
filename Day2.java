/* Check if the Person is Eligible to vote or Not*/

import java.util.Scanner;

class VoterEligibleTest {

    void checkEligibility(int age) {
        if (age >= 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VoterEligibleTest voter = new VoterEligibleTest();

        System.out.print("Enter the age of the person: ");
        voter.checkEligibility(sc.nextInt());

        sc.close();
    }
}
