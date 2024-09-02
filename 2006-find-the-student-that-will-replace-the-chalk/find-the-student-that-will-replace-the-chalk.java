class Solution {
    public int chalkReplacer(int[] chalk, int k) {
       long totalChalk = 0;
        for (int c : chalk) {
            totalChalk += c;

            if(totalChalk>k)
                break;
        }

        // Reduce k by the total chalk to get the remaining chalk to distribute
        k %= (int) totalChalk;

        // Find the student who will use up the remaining chalk
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        return -1;
    }
}