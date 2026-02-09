public class Reverse {
    public static void main(String[] args) {
        String name = "Coding";
        int start = 0;
        int end = name.length() - 1;
        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) {
                System.out.println("It is not a Palindrome");
                break;
            } else {
                System.out.println("It is a Palindrome");
                start++;
                end--;
            }
        }
    }
}
