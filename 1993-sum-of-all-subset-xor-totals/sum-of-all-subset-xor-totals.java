class Solution {
    public int subsetXORSum(int[] nums) {
        return findXor(nums,0,0);
    }
    private int findXor(int[] arr,int index, int xor){
        if(index==arr.length) return xor;
        int pick = findXor(arr,index+1,xor^arr[index]);
        int noPick=findXor(arr,index+1,xor);
        return pick+noPick;  
    }
}