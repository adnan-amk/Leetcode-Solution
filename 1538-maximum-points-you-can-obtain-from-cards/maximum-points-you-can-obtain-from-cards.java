class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum = 0, rsum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            lsum+=nums[i];
        }
        maxSum=lsum;
        int rightIndex = nums.length-1;
        for(int i=k-1;i>=0;i--){
            lsum = lsum - nums[i];
            rsum = rsum + nums[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }
}