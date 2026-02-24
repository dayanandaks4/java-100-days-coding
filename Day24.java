public class Pattern {
    public static void main(String[] args) {
        int height = 0;
        int i = 5;
        while (i > height) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
            i = i - 1;
        }
    }
}
/*
OUTPUT :
*****
****
***
**
*
*/
