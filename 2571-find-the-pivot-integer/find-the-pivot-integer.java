class Solution {
    public int pivotInteger(int n) {
        // Calculate the total sum of numbers from 1 to n
        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;
        // Iterate through the array to find the pivot index
        for (int i = 1; i <= n; i++) {
            leftSum += i;

        // If leftSum equals half of totalSum, i is the pivot
        if (leftSum == totalSum - leftSum + i) {
            return i;
        }
    }

    // If no pivot index is found, return -1
    return -1;
    }
}