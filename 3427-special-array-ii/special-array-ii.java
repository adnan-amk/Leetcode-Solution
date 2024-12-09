class Solution {
    public boolean[] isArraySpecial(int[] n, int[][] q) {
        int len = n.length;
        int[] prefixSum = new int[len];
        
        // Step 1: Build the prefix sum array
        for (int i = 0; i < len - 1; i++) {
            boolean alternates = (n[i] % 2 != n[i + 1] % 2);
            prefixSum[i + 1] = prefixSum[i] + (alternates ? 1 : 0);
        }
        
        // Step 2: Answer each query using the prefix sum
        boolean[] ans = new boolean[q.length];
        for (int i = 0; i < q.length; i++) {
            int start = q[i][0];
            int end = q[i][1];
            
            if (end == start) {
                ans[i] = true; // Single element range is always special
            } else {
                ans[i] = (prefixSum[end] - prefixSum[start] == end - start);
            }
        }
        
        return ans;
    }
}
