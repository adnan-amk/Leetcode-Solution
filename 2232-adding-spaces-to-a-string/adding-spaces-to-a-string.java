class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int p=0; 
        for(int i=0;i<s.length();i++){
            if(p<spaces.length && i == spaces[p]){
                res.append(" ").append(s.charAt(i));
                p++;
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}