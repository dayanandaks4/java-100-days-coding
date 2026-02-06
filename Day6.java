import java.util.Scanner;


public class numberinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;

        while (sc.hasNextLine()) {
            String user = sc.nextLine();
            System.out.println(i + " " + user);
            i++;
        }

        sc.close();
    }
}
