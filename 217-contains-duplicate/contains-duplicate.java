class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int cnt=map.getOrDefault(nums[i],0)+1;
            map.put(nums[i],cnt);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>1)
                return true;
        }
        return false;
    }
}