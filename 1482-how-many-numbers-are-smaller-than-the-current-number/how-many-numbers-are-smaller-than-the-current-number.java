class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] counts = new int[101]; // Since the constraints say 0 <= nums[i] <= 100
        int[] result = new int[nums.length];
        
        // Count the occurrences of each number
        for (int num : nums) {
            counts[num]++;
        }
        
        // Calculate the cumulative sum of counts
        for (int i = 1; i < counts.length; i++) {
            counts[i] += counts[i - 1];
        }
        
        // Populate the result array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[i] = counts[nums[i] - 1];
            }
        }
        
        return result;
    }
}