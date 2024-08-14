class Solution {
    public int numberOfSteps(int n) {
        if(n==0)
            return 0;
        if(n%2==0)
            return numberOfSteps(n/2)+1;
        return numberOfSteps(n-1)+1;
    }
}