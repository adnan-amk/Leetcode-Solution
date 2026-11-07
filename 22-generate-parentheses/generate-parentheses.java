class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(ans,new String(),0,0,n);
        return ans;
    }
    private void helper(List<String> ans,String cur,int open,int close,int n){
        if(open + close == 2 * n){
            ans.add(cur);
            return;
        }
        if(open < n){
            helper(ans,cur+"(",open+1,close,n);
        }
        if(close < open){
            helper(ans,cur+")",open,close+1,n);
        }
    }
}