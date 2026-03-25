import java.util.Scanner;


class Swaping{
    int swap(int num1, int num2) {
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping: " + " num1 :"+ num1 + " num2 : " + num2);
        return  0;
    }

}
class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        Swaping s = new Swaping();
        s.swap(num1,num2);
    }
}
