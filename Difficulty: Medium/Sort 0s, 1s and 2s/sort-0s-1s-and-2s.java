class Solution {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]= arr[low];
                arr[low]=temp;
                mid++;
                low++;
            } else if (arr[mid]==1){
                mid++;
            } else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}