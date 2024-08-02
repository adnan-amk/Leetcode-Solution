class Solution {
    public int pivotIndex(int[] arr) {
        int len=arr.length;
        int right = 0;
        int left=0;
        
        for(int i=0;i<len;i++)
            right+=arr[i];
        
        for(int i=0;i<len;i++){
            right-=arr[i];
            if(left==right)
                return i;
            left+=arr[i];
        }
        return -1;
    }
}