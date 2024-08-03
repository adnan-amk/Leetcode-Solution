class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer,Integer> arrFreq=new HashMap<>();
        Map<Integer,Integer> tgtFreq=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int freq1=arrFreq.getOrDefault(arr[i],1)+1;
            int freq2=tgtFreq.getOrDefault(target[i],1)+1;
            arrFreq.put(arr[i],freq1);
            tgtFreq.put(target[i],freq2);
        }
        if(arrFreq.size()!=tgtFreq.size())
            return false;
        for(int i=0;i<arr.length;i++){
            if(arrFreq.get(arr[i])!=tgtFreq.get(arr[i]))
                return false;
        }
        return true;
    }
}