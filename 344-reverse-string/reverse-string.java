class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        fn(s,0,n-1);
    }
    public void fn(char[] s,int i,int n){
        if( i >= n )
            return;
        swap(s,i,n);
        fn(s,i+1,n-1);
    }
    private void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}