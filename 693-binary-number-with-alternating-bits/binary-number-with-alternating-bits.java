class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevBit = n & 1;
        int currBit = prevBit;
        n = n >> 1;
        while(n > 0){
            currBit = n & 1;
            if(prevBit == currBit)
                return false;
            prevBit = currBit;
            n = n >> 1;
        }
        return true;
    }
}