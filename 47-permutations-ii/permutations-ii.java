class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);  // Sort to handle duplicates
        helper(nums, 0, ans);
        return ans;
    }

    private void helper(int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int num : nums) {
                ds.add(num);
            }
            ans.add(ds);
            return;
        }

        Set<Integer> set = new HashSet<>();  // To track already swapped elements
        for (int i = index; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;  // Skip duplicates
            }
            set.add(nums[i]);
            swap(nums, i, index);  // Swap to fix the current element
            helper(nums, index + 1, ans);  // Recurse for the next position
            swap(nums, i, index);  // Backtrack
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
