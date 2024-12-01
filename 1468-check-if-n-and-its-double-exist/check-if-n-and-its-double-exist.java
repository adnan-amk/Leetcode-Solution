class Solution {
    public boolean checkIfExist(int[] arr) {
        /*Brutre force approach
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]*2 && i!=j)
                    return true;
            }
        }*/
        /*Better aproach*/
        Set<Integer> seen = new HashSet<>();
        for(int e : arr){
            if(seen.contains(e*2) || (e%2==0 && seen.contains(e/2)))
                return true;
            seen.add(e);
        }
        return false;
    }
}