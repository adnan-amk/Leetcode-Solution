class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list=new ArrayList<>();
        return uniqueSubsequences(0,nums,nums.length,list);
    }
    public static List<List<Integer>> uniqueSubsequences(int index,int[] arr,int n,List<Integer> list){
            if(index==n){
                List<List<Integer>> newList=new ArrayList<>();
                newList.add(new ArrayList<>(list));
                return newList;
            }
            list.add(arr[index]);
            List<List<Integer>> include= uniqueSubsequences(index+1,arr,n,list);
            list.remove(list.size() - 1 );
            List<List<Integer>> exclude= uniqueSubsequences(index+1,arr,n,list);
            include.addAll(exclude);
            return include;
    }
}