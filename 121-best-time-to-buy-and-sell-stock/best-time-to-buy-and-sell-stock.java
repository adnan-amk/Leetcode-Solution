class Solution {
    public int maxProfit(int[] p) {
        int i=0,j=1;
        int max=0;
        while(j<p.length)
        {
            if(p[i]>p[j])
                i=j;
            else if(p[i]<p[j])
            {
                max=Integer.max(max,(p[j]-p[i]));
            }
            j++;
        }
        return max;
    }
}