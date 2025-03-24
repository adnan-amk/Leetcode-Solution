class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low  = 0, high = n-1;
        int index = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(target==nums[mid]){
                index = mid;
                break;
            }
            else if(target<nums[mid])
                high = mid - 1;
            else 
                low = mid + 1;
        }
        if(index == -1)
            return low;
        return index;
    }
}