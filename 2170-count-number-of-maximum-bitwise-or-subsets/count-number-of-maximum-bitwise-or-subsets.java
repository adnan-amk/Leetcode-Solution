class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int targetOr=0;
        for(int num:nums) 
            targetOr|=num;
        return rec(0,nums,0,targetOr);
    }
    public int rec(int idx,int nums[],int curOr,int targetOr){
        //base case
        if(idx == nums.length)
            return (curOr == targetOr) ? 1 : 0;
        //pick
        int pickCount = rec(idx+1,nums,curOr | nums[idx],targetOr);
        //no pick
        int noPickCount = rec(idx+1,nums,curOr,targetOr);

        return pickCount + noPickCount;
    }
}
