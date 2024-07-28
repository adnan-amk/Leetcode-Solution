class Solution {
    public boolean isStrictlyPalindromic(int n) {
      // Iterate through all bases from 2 to n-2
        for (int base = 2; base <= n - 2; base++) {
            String converted = convertToString(n, base);
            if (!checkForPalindrome(converted)) {
                return false;  // Return false immediately if not a palindrome in any base
            }
        }
        return true;   
    }
    public String convertToString(int n,int base){
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            sb.append(n%base);
            n=n/base;
        }
        return sb.reverse().toString();
    }

    public boolean checkForPalindrome(String str)
    {
        int l=0,r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r))
                return false;
            r--;
            l++;
        }
        return true;
    }
}