class Solution {
    public long dividePlayers(int[] skills) {
        int n=skills.length;
        
        // If the number of players is odd, it's not possible to form pairs
        if(n <=1 || n%2!=0)
            return -1;
        
        // Calculate the total sum of all skill values
        int totalSum = 0;
        
        for(int skill : skills)
            totalSum+=skill;

        // The target sum for each pair should be consistent
        int targetSum = totalSum / (n / 2);
        
        Arrays.sort(skills);
        long totalProduct = 0;
        int i=0,j=n-1;
        while(i<=j){
            // Check if the pair sum is equal to the target
            if (skills[i] + skills[j] != targetSum)
            return -1;
        
            // Add the product of the current pair to the total product
            totalProduct += (long)skills[i] * skills[j];

            i++;
            j--;
        }
        return totalProduct;
    }
}