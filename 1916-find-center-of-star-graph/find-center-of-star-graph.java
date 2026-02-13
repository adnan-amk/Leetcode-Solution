class Solution {
    public int findCenter(int[][] edges) {
        int c1 = edges[0][0];
        int c2 = edges[0][1];
        int ans = -1;
        for(int i = 1;i<edges.length;i++){
           int v1 = edges[i][0];
            int v2 = edges[i][1];
            if(c1 == v1 || c1 == v2)
                ans = c1;
            else if(c2 == v1 || c2 == v2)
                ans = c2;
        }
        return ans;
    }
}