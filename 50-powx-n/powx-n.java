class Solution {
    public double myPow(double x, int n) {
        // double res=x;
        // if(n==0)
        //     return 1.00;
        // if(n<0){
        //     n=(n*(-1));
        //     for(int i=1;i<n;i++){
        //         res*=x;
        //     }
        // return 1/res;
        // }
        // for(int i=1;i<n;i++){
        //     res*=x;
        // }
        // return res;
        // Define a large threshold to detect overflow
        final double THRESHOLD = Double.MAX_VALUE;

        // Handle base case where n is 0
        if (n == 0) {
            return 1.0;
        }

        // Convert n to long to handle the case where n is Integer.MIN_VALUE
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        double currentProduct = x;
        
        while (N > 0) {
            if (N % 2 == 1) {
                result *= currentProduct;
                // Check for overflow
                if (Math.abs(result) >= THRESHOLD) {
                    return 0.0;
                }
            }
            currentProduct *= currentProduct;
            // Check for overflow
            if (Math.abs(currentProduct) >= THRESHOLD) {
                return 0.0;
            }
            N /= 2;
        }

        return result;
    }
}