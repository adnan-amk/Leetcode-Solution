class Solution {
    public int findComplement(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        while(n!=0){
            list.add(n%2);
            n=n/2;
        }
        Collections.reverse(list);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==1)
                list.set(i,0);
            else
                list.set(i,1);
        }
        int two=1;
        for(int i=list.size()-1;i>=0;i--){
            n = n + list.get(i) * two;
            two=two*2;
        }
        return n;
    }
}