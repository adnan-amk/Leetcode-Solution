class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int counter=k+1;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                if(counter<k)
                    return false;
                counter = 0; 
            }else 
                counter++;
        }
        return true;
    }
}