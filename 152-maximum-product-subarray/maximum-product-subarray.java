class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int ans = nums[0];
        for (int i = 1; i < n; i++) {
            int x = nums[i];
            int maxCur = Math.max(x,Math.max(maxEnding*x,minEnding*x));
            int minCur = Math.min(x,Math.min(maxEnding*x,minEnding*x));
            maxEnding = maxCur;
            minEnding = minCur;
            ans = Math.max(ans, maxEnding);
        }
        return ans;
    }
}