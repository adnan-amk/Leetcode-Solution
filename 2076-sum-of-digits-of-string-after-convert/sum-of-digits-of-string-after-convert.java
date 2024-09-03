class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a' + 1; // 'a' -> 1, 'b' -> 2, ..., 'z' -> 26
            sb.append(value);
        }

        // Convert the string to an integer sum
        int total = 0;
        for (int i = 0; i < sb.length(); i++) {
            total += sb.charAt(i) - '0'; // sum the digits of the number string
        }

        // Step 2: Perform k transformations
        for (int i = 0; i < k - 1; i++) {
            int newTotal = 0;
            while (total > 0) {
                newTotal += total % 10;
                total /= 10;
            }
            total = newTotal;
        }

        return total;
    }
}