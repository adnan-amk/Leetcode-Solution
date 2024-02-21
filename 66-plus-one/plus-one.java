class Solution {
    public int[] plusOne(int[] a) {
        int n=a.length;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]<9)
            {
                a[i]++;
                return a;
            }
            else
                a[i]=0;
        }
        int result[]=new int[n+1];
        result[0]=1;
        return result;
    }
}