class Solution {
    public int lengthOfLongestSubstring(String str) {
        Set<Character> set=new HashSet<>();
        int max=0,s=0,e=0;
        while(s<str.length()){
            if(!set.contains(str.charAt(s))){
                if(s-e+1>max){
                    max=s-e+1;
                }
                set.add(str.charAt(s));
                s++;
            }
            else{
                set.remove(str.charAt(e));
                e++;
            }
        }
        return max;
    }
}