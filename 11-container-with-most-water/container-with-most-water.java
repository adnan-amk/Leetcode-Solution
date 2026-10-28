class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = Integer.MIN_VALUE;
        int left = 0, right = n - 1;
        while(left<=right){
            int len = right - left;
            int area = len * Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea,area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}