class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int n : nums){
            max = Math.max(n,max);
        }
        for(int n : nums){
            count+= max - n;
        }
        return count;
    }
}