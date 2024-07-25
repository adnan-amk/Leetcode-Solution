class Solution {
    
    public void merge(int arr[],int s,int m,int e){
        int n1=m-s+1;
        int n2=e-m;
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        
        for(int i=0;i<n1;i++){
            arr1[i]=arr[s+i];
        }

        for(int i=0;i<n2;i++){
            arr2[i]=arr[m+1+i];
        }

        int i=0;
        int j=0;
        int k=s;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                 arr[k]=arr1[i];
                 i++;
            }
            else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
    public void mergeSort(int arr[],int s, int e){
        if(s<e){
            int m=s+(e-s)/2;
            mergeSort(arr,s,m);
            mergeSort(arr,m+1,e);
            merge(arr,s,m,e);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
    return nums;
    }
}