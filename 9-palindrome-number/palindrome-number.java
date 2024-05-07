class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        if(x>=0 && x<10)
        {
            return true;
        }
        int num=x;
        int revNum=0;
        while(num!=0)
        {
            int res=num%10;
            revNum=revNum*10+res;
            num/=10;
        }
        if(revNum==x)
            return true;
        return false;
    }
}