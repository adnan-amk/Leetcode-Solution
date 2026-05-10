class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums)
            sum += n;
        
        // If the total sum is odd, we cannot split it into two equal integer halves
        if(sum % 2 != 0)
            return false;
        
        return subSetsum(nums, sum / 2);
    }

    private boolean subSetsum(int[] nums, int sum) {
        int n = nums.length;
        boolean[][] t = new boolean[n + 1][sum + 1];

        // Initialization
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= sum; j++) {
                if(i == 0)
                    t[i][j] = false; // With 0 elements, we can't make any sum > 0
                if(j == 0)
                    t[i][j] = true;  // With a target sum of 0, we can always succeed (by picking nothing)
            }
        }

        // Filling the table
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sum; j++) {
                // If the current element is less than or equal to the target sum 'j'
                if(nums[i - 1] <= j) {
                    // Result is (Include the element) OR (Exclude the element)
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
                } else {
                    // Element is too large; must exclude it
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}