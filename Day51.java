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





import java.util.Scanner;


class checkNumber{
    String evenOrOdd(int number){
        if( number % 2 ==0 ){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        return null;
    }
}
class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        checkNumber cn = new checkNumber();
        System.out.print("Enter the  number: ");
        int number = sc.nextInt();
        cn.evenOrOdd(number);

    }
}
