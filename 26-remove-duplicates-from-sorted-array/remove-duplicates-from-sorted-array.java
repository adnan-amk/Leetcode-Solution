class Solution {
    public int removeDuplicates(int[] nums) {
        int n  = nums.length;
        if( n == 0){
            return 0;
        }
        int i = 0, j = 0;
        // nums[j] = nums[i];
        for( i=1;i<n;i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] =  nums[i];
            }
        }
        return j+1;
    }
}