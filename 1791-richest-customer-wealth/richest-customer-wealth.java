class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        for(int i=0;i<accounts.length;i++)
        {
            int maxWealth=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                maxWealth+=accounts[i][j];
            }
            if(maxWealth>res)
                res=maxWealth;
        }
        return res;
    }
}