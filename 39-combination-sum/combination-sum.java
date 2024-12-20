class Solution {
    private void helper(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(ind==arr.length){
            if(target==0)
                ans.add(new ArrayList<>(ds));
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            helper(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        helper(ind+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        helper(0,candidates,target,ans,ds);
        return ans;
    }
}