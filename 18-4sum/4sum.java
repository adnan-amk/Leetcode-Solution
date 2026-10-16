
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second elements
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int l = j + 1;
                int k = n - 1;

                while (l < k) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k];

                    if (sum < t) {
                        l++;
                    } else if (sum > t) {
                        k--;
                    } else {
                        ans.add(Arrays.asList(
                            nums[i], nums[j], nums[l], nums[k]
                        ));

                        l++;
                        k--;

                        // Skip duplicate third elements
                        while (l < k && nums[l] == nums[l - 1]) {
                            l++;
                        }

                        // Skip duplicate fourth elements
                        while (l < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                    }
                }
            }
        }

        return ans;
    }
}
