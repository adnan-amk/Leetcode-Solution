class Solution {
    public int maxOperations(int[] nums, int k) {
     int n = nums.length;
     Arrays.sort(nums);

     int i=0,j=n-1;

     int count=0;
     while(i<j){
        int sum = nums[i] + nums[j];

        if (sum == k) {
            count++;
            i++; // Move both pointers if a valid pair is found
            j--;
        } else if (sum < k) {
            i++; // Move the left pointer to increase the sum
        } else {
            j--; // Move the right pointer to decrease the sum
        }
     }
     return count;
    }
}