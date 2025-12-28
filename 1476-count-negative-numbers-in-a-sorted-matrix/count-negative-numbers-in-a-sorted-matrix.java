class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int i = 0;
        int j = cols - 1;
        int count = 0;

        while (i < rows && j >= 0) {
            if (grid[i][j] < 0) {
                // All elements below grid[i][j] are negative
                count += (rows - i);
                j--;
            } else {
                i++;
            }
        }
        return count;
    }
}