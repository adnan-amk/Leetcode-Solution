class Solution {
    public boolean checkIfExist(int[] arr) {
        /*Brutre force approach*/
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]*2 && i!=j)
                    return true;
            }
        }
        return false;
    }
}