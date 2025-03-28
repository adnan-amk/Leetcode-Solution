class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>nums.length/2)
                max = e.getKey();
        }
        return max;
    }
}