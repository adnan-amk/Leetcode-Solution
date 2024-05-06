class Solution {
    public int reverse(int x) {
        // check whether the number is negative
        boolean flag=false;
        if(x<0)
        {
            flag=true;
            // convert the number into positive
            x=-x;
        }
        long ans=0;
        while(x!=0)
        {
            int rem=x%10;
            ans=ans*10+rem;
            x=x/10;
        }
        // if the number was negative
        if(flag)
            ans=-ans;
        /*
        If the number is integer overflow
        */
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
        {
            return 0;
        }
        return (int)ans;
    }
}