class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int step = 1;
        backtrack(step,0,0,new String(),ans,n);
        return ans;
    }
    private void backtrack(int step,int open,int close,String str,List<String> ans,int n){
        if(open == close && open + close == 2 * n){
            System.out.println("Step -> "+(step)+str);
            ans.add(str);
            return;
        }
        if(open < n){
            backtrack(step+1,open+1,close,str+"(",ans,n);
            System.out.println("Step -> "+(step)+str);
        }
        if(close < open){
            backtrack(step-1,open,close+1,str+")",ans,n);
            System.out.println("Step -> "+(step)+str);
        }
    }
}