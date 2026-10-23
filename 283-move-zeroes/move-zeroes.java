class Solution {
    private void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0, j = 0;
        while(j<n){
            if(nums[j] == 0){
                j++;
            }
            else {
                swap(nums,i,j);
                i++;
                j++;
            }
        }
    }
}