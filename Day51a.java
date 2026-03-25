class Solution {
    public int lengthOfLastWord(String string) {
        int length = 0;
        int totalength = string.length() - 1;

    
        while (totalength >= 0 && string.charAt(totalength) == ' ') {
            totalength--;
        }


        while (totalength >= 0 && string.charAt(totalength) != ' ') {
            length++;
            totalength--;
        }

        return length;
    }
}
