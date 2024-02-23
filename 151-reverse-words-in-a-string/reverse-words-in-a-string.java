class Solution {
    public static void  swap(String arr[],int i,int j)
    {
        String temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public String reverseWords(String s) {
        String arr[]=s.split("\\s+");
        int i=0,j=arr.length-1;
        while(i<=j)
        {
            swap(arr,i,j);
            i++;
            j--;
        }
        StringBuilder str = new StringBuilder();
        for (int p = 0; p < arr.length; p++) {
            arr[p] = arr[p].trim();
            str.append(arr[p]).append(" ");
        }

        // Remove the trailing space
        return str.toString().trim();
    }
}