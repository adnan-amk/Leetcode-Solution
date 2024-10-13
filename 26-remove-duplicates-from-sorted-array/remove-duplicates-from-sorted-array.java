class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<Integer> list=new ArrayList<>(set);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        return set.size();
    }
}