class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        for(int i=1;i<n;i++){
            prefix[i] = nums[i] + prefix[i-1];
        }
        int totalSum = prefix[n-1];
        for(int i= 0 ; i < n; i++){
            int rightSum = totalSum - prefix[i];
            int leftSum = prefix[i] - nums[i];
            if(rightSum == leftSum){
                return i;
            }
        }
        return -1;
    }
}