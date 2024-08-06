class Solution {
    public int minimumPushes(String word) {
        int[] arr=new int[26];
        //here we are storing the freq of each char in string
        for(char ch:word.toCharArray()){
            arr[ch-'a']++;
        }
        Arrays.sort(arr);
        int minKeyPress=0;
        int count=0;
        for(int i=25;i>=0;i--){
            int val=arr[i]*(count/8 + 1);
            minKeyPress+=val;
            count++;
        }
        return minKeyPress;
    }
}