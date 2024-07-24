class Solution {
    public int[] convertToNewSys(int[] mapping,int nums[]){
        int n=nums.length;
        int newSys[]=new int[n];
        for(int j=0;j<n;j++){
            int num=nums[j];
            if(num==0){
                newSys[j]=mapping[0];
                continue;
            }
            int i=0;
            int res=0;
            while(num>0){
                int d=num%10;// digit extraction
                int newDigit= mapping[d]; //conversion
                res=newDigit*(int)Math.pow(10,i)+res; //no formation
                num=num/10; //removal of last digit
                i++; // moving to next digit
            }
            newSys[j]=res;
        }
        return newSys;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n=nums.length;
        int newSys[]=convertToNewSys(mapping,nums);
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++){
            idx[i]=i;
        }
        Arrays.sort(idx,(a,b)->{
            return newSys[a]-newSys[b];
        });

        int res[]=new int[n];
        int i=0;
        for(int index:idx)
        {
            res[i]=nums[index];
            i++;
        }
        return res;
    }   
}