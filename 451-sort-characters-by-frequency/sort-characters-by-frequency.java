class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int k=map.getOrDefault(s.charAt(i),0)+1;
            map.put(s.charAt(i),k);
        }

        /*this will give the list of entry set*/
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());

        Collections.sort(list,(entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));

        String str="";

        /*In this we will iterate of each entry set and build the string accordingly*/
        for(Map.Entry<Character,Integer> e:list)
        {
            char key=e.getKey();
            int count=e.getValue();
            for(int i=0;i<count;i++)
                str+=key;
        }
        return str;
    }
}