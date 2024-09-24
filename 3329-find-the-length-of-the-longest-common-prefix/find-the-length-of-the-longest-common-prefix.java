class Node{
    Node child[];
    Node(){
        // 0 to 9 digits
        child=new Node[10];
    }
}
class Trie{
    Node root;
    Trie(){
        root=new Node();
    }
    public void addWord(String word){
        Node temp=root;
        for(char ch:word.toCharArray()){
            int index=ch-'0';
            if(temp.child[index]==null)
                temp.child[index]=new Node();    
            temp=temp.child[index];
        }
    }

    public int findPrefix(String word){
        Node temp=root;
        int len=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int index=ch-'0';
            if(temp.child[index]==null){
                break;
            }
            temp=temp.child[index];
            len++;
        }
        return len;
    }
}

class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie=new Trie();
        int maxLen=Integer.MIN_VALUE;
        for(int ele:arr1){
            trie.addWord(Integer.toString(ele));
        }
        for(int ele:arr2){
            int len=trie.findPrefix(Integer.toString(ele));
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}