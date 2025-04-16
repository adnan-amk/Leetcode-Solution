class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> fm = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            fm.put(nums[i],fm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:fm.entrySet()){
            if(e.getValue()>=2){
                return true;
            }
        }
        return false;
    }
}