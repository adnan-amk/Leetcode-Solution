class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        backtrack(nums,0,ans,ds);
        return ans;
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void backtrack(int[] nums,int idx,List<List<Integer>> ans,List<Integer> ds){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        else{
            for(int i=idx;i<nums.length;i++){
                swap(nums, idx, i);
                ds.add(nums[idx]);
                backtrack(nums,idx+1,ans,ds);
                ds.remove(ds.size()-1);
                swap(nums, idx, i);
            }
        }
    }
}