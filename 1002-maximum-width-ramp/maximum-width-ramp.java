class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(st.isEmpty() || nums[st.peek()]>nums[i]){
                st.push(i);
            }
        }
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                max=Math.max(max,i-st.pop());
            }
            if(st.isEmpty())
                break;
        }
    return max;
    }
}