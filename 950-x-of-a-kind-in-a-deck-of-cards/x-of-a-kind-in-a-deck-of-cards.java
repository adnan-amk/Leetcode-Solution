class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<=1)
            return false;
     Map<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<deck.length;i++){
        int cnt=map.getOrDefault(deck[i],0)+1;
        map.put(deck[i],cnt);
     }
     // Find the GCD of all the frequencies
        int gcd = -1;
        for (int count : map.values()) {
            if (gcd == -1) {
                gcd = count; // Initialize GCD with the first frequency
            } else {
                gcd = gcd(gcd, count);
            }
        }
     return gcd>=2;
    }
    // Helper function to calculate GCD of two numbers
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}