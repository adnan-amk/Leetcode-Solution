/* This approach uses extra space

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
}*/


class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        
        int i = 0, j = 0;
        nums[j] = nums[i];
        for(i=1;i<nums.length;i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}