import java.util.Scanner;

class checkNumber {
    Boolean isDigit(String string) {
        boolean result = true;
        for (int index = 0; index < string.length() ; index++) {
            if (string.charAt(index) < '0' || string.charAt(index) > '9') {
                result = false;
                break;
            }
        }
        return result;
    }
}
class Main {
    public static void main(String[] args) {
        checkNumber cn = new checkNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.next();
        System.out.println(cn.isDigit(string));
    }
}
