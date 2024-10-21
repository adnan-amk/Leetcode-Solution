class Solution {
    int maxCount = 0;
    public int maxUniqueSplit(String s) {
        maxCount = 0;
        HashSet<String> set = new HashSet<>();
        helper(s,set,0);
        return maxCount;
    }
    private void helper(String s,HashSet<String> set,int index){
        int n = s.length();
        if(index==s.length()){
            maxCount= Math.max(maxCount,set.size());
            return;
        }
        for(int i=index;i<n;i++){
            String sub = s.substring(index,i+1);
            if(!set.contains(sub)){
                set.add(sub);
                helper(s,set,i+1);
                set.remove(sub);
            }
        }
    }
}