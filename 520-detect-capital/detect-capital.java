class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1)
            return true;
        
        int count=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(c>='A' && c<='Z')
                count++;
        }
        if(count==word.length())
            return true;
        if(count==1)
        {
            char ch=word.charAt(0);
            if(ch>='A' && ch<='Z')
            return true;
        }
        if(count==0)
        {
            return true;
        }
        return false;
    }
}