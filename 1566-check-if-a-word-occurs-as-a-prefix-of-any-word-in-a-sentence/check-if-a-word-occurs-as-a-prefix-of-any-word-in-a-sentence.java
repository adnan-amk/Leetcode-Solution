class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            int p = 0, q = 0;
            if(arr[i].length()>=searchWord.length()){
                while(q!=searchWord.length()){
                    if(arr[i].charAt(p)!=searchWord.charAt(q)){
                        break;
                    }
                    else{
                        p++;
                        q++;
                    }
                    if(q==searchWord.length())
                        return i+1;
                }
            }
        }
        return -1;
    }
}