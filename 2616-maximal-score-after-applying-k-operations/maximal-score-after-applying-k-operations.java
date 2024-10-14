class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for(int i : nums){
            q.add(i);
        }
        long score=0;
        for(int j=1;j<=k;j++){
            int temp=q.poll();
            score+=temp;
            q.add((temp+2)/3);
        }
        return score;
    }
}