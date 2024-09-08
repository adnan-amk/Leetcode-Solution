class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=nums1[i];
        }
        int k=0;
        for(int i=0;i<nums2.length;i++){
            k=i+nums1.length;
            ans[k]=nums2[i];
        }
        Arrays.sort(ans);
        int len=ans.length;
        if(len%2==0){
            int i1=ans[len/2];
            int i2=ans[len/2-1];
            return (double)((i1+i2))/2;
        }
        return (double)ans[len/2];
    }
}