/*
Find the first non-repeated character in a string.
The program checks each character and counts how many times it appears.
If the count is 1, that character is printed and the loop stops.
*/

class Main {
    public static void main(String[] args) {
        String str = "aabbcde";
        for(int i = 0; i < str.length(); i++) {
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("First non-repeated character: " + str.charAt(i));
                break;
            }
        }
    }
}
