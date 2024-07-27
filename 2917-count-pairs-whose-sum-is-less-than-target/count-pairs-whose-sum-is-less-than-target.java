class Solution {
    public int countPairs(List<Integer> nums, int target) {
        // Sort the list
        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        // Use two pointers to find pairs
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                // All elements from left+1 to right can form valid pairs with nums.get(left)
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}