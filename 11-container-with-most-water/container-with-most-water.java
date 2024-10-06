class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int area=0;
        int max=Integer.MIN_VALUE;
        int len=0,breadth=0;
        while(i<=j){
            if(height[i]<height[j])
                len=height[i];
            else
                len=height[j];
            breadth = j-i;
            area=len*breadth;
            if(area>max)
                max=area;
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return max;
    }
}