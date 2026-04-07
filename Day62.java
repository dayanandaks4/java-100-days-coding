class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int index = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (index >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (index >= 0) {
                sum += a.charAt(index) - '0';
                index--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;      
        }

        return result.reverse().toString();
    }
}
