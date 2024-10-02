class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Set<Integer> set=new TreeSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        Map<Integer,Integer> map=new HashMap<>();
        int index=1;
        for (Iterator<Integer> it = set.iterator(); it.hasNext(); ) {
        Integer ele = it.next();
            map.put(ele,index++);
        }
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=map.get(arr[i]);
        }

        return ans;
    }
}