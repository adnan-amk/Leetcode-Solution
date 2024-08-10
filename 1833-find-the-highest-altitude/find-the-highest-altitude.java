class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; // The maximum altitude starts at 0
        int currentAltitude = 0; // Start at altitude 0

        for(int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i]; // Update the current altitude
        if(currentAltitude > maxAltitude) {
            maxAltitude = currentAltitude; // Update max if current is higher
        }
    }

    return maxAltitude;
    }
}