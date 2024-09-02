class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> ds=new ArrayList<>();
       Arrays.sort(nums);
       helper(0,nums,ans,ds);
       return ans; 
    }
    private static void helper(int index,int[] arr,List<List<Integer>> ans,List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1])
                continue;
            ds.add(arr[i]);
            helper(i+1,arr,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}