class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        if(s1.length()>s2.length()){
            return areSentencesSimilar(s2,s1);
        }

        String smaller[]=s1.split(" ");
        String larger[]=s2.split(" ");

        int start=0;
        int end1=smaller.length-1;
        int end2=larger.length-1;

        //Find prefix word
        while(start<=end1 && smaller[start].equals(larger[start])){
            start++;
        }

        //Find sufix word
        while(start<=end1 && smaller[end1].equals(larger[end2])){
            end1--;
            end2--;
        }

        return (start>end1);
    }
}
