class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(j);

            // Check if c1 matches c2 directly or via the cyclic rule
            if (c1 == c2 || c2 == (c1 == 'z' ? 'a' : c1 + 1)) {
                j++; // Move to the next character in str2
            }

            i++; // Always move to the next character in str1
        }

        // Ensure all characters in str2 are matched
        return j == str2.length();
    }
}
