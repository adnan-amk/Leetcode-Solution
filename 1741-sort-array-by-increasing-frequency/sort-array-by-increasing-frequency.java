class Solution {
    public int[] frequencySort(int[] nums) {
        int len=nums.length;
        Map<Integer,Integer> freqMap=new HashMap<>();
        // Stores all the freq of values
        for(int num : nums)
        {
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        Integer temp[]=new Integer[freqMap.size()];
        int i=0;
        for(Integer key:freqMap.keySet())
        {
            temp[i]=key;
            i++;
        }

        //create a custom comparator to compare values based on freq    
        Arrays.sort(temp, (a,b)->{
                if(freqMap.get(a)==freqMap.get(b)) //decreasing order of value
                    return b-a;
                return freqMap.get(a)-freqMap.get(b); //inc order of value
        });
        
        i=0;
        for(int key:temp)
        {
            int f=  freqMap.get(key);
            for(int j=0;j<f;j++)
            {
                nums[i]=key;
                i++;
            }
        }
        return nums;
    }
}