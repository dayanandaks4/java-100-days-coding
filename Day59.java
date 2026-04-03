
// function to print Ascii value of String input....

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input  = sc.nextLine();
        for( int i = 0; i< input.length(); i++){
            char ch = input.charAt(i);
            int asciiValue =  (int) ch;
            System.out.println("ASCII value of " + ch + " : " + asciiValue );
        }
    }
}
// OUTPUT :
// Enter a string: Dayananda K S
// ASCII value of D : 68
// ASCII value of a : 97
// ASCII value of y : 121
// ASCII value of a : 97
// ASCII value of n : 110
// ASCII value of a : 97
// ASCII value of n : 110
// ASCII value of d : 100
// ASCII value of a : 97
// ASCII value of   : 32
// ASCII value of K : 75
// ASCII value of   : 32
// ASCII value of S : 83
