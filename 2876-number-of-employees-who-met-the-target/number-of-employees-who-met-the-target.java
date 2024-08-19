class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans=0;
        for(int e:hours){
            if(e>=target)
                ans++;
        }
        return ans;
    }
}