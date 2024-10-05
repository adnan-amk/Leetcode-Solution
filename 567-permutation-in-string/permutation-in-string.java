class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m[] = new int[26];
        for(Character c:s1.toCharArray()){
            m[c-'a']++;
        }
        int j=0,i=0, totalChars=s1.length();
        while(j<s2.length()){
            if(m[s2.charAt(j++)-'a']-- > 0)
                totalChars--;
            if(totalChars==0)
                return true;
            if(j-i == s1.length() && m[s2.charAt(i++)-'a']++ >=0)
                totalChars++;
        }
        return false;
    }
}