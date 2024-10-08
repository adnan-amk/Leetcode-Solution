class Solution {
    public int[] leftRightDifference(int[] nums) {
      int n=nums.length;
      if(n<=1)  
        return new int[]{0};
      int[] leftArray=new int[n];
      int[] rightArray=new int[n];
      for(int i=1;i<n;i++){
        leftArray[i]=nums[i-1]+leftArray[i-1];
      }
      for(int i=n-2;i>=0;i--){
        rightArray[i]=nums[i+1]+rightArray[i+1];
      }
      for(int i=0;i<n;i++){
        nums[i]=Math.abs(leftArray[i]-rightArray[i]);
      }
      return nums;
    }
}