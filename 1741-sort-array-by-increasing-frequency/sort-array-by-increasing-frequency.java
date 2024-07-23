class Solution {
    public int[] frequencySort(int[] nums) {
        int len=nums.length;
        Map<Integer,Integer> freqMap=new HashMap<>();
        // Stores all the freq of values
        for(int num : nums)
        {
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        Integer temp[]=new Integer[len];
        for(int i=0;i<len;i++)
            temp[i]=nums[i];

        //create a custom comparator to compare values based on freq    
        Arrays.sort(temp, (a,b)->{
                if(freqMap.get(a)==freqMap.get(b)) //decreasing order of value
                    return b-a;
                return freqMap.get(a)-freqMap.get(b); //inc order of value
        });
        for(int i=0;i<len;i++)
            nums[i]=temp[i];
        return nums;
    }
}