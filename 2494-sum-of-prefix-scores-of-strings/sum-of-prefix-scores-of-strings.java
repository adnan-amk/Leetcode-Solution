class Node{
    Node child[];
    int count;
    Node(){
        child=new Node[26];
        count=0;
    }
}

class Trie{
    Node root;
    Trie(){
        root = new Node();
    }
    public void addWord(String w){
        Node temp=root;
        for(char ch:w.toCharArray()){
            int index=ch-'a';
            if(temp.child[index]==null){
                temp.child[index]=new Node();
            }
            temp.child[index].count++;
            temp=temp.child[index];
        }
    }
    public int findPrefixCount(String w){
        Node temp=root;
        int count=0;
        for(char ch:w.toCharArray()){
            int index=ch-'a';
            count+=temp.child[index].count;
            temp=temp.child[index];
        }
        return count;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie=new Trie();
        int count[]=new int[words.length];
        for(String w:words){
            trie.addWord(w);
        }
        int index=0;
        for(String w:words){
            count[index] = trie.findPrefixCount(w);
            index++;
        }
        return count;
    }
}