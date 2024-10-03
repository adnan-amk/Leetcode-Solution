class Solution {
    public int minSubarray(int[] nums, int p) {
       int n = nums.length;
       int total = 0;

        for(int num : nums) 
            total=(total+num)%p;
        
        int target = total % p;
        if(target == 0)
            return 0;

        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);

        int curSum=0;
        int minLen=n;

        for(int i=0;i<n;i++){
            curSum=(curSum + nums[i]) % p;

            int needed = (curSum - target + p)%p;

            if(map.containsKey(needed))
                minLen = Math.min(minLen,i - map.get(needed));
            
            map.put(curSum,i);
        }

        return minLen == n ? -1 : minLen;
    }
}