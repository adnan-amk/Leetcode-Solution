class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            Integer age=new Integer(details[i].substring(11,13));
            System.out.println(age);
            if(age>60)
                count++;
        }
        return count;
    }
}