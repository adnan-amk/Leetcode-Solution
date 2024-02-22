class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=Integer.MIN_VALUE;
        for(int i=0;i<sentences.length;i++)
        {
            int temp=sentences[i].split(" ").length;
            if(temp>len)
            {
                 len=temp;
            }
        }
        return len;
    }
}