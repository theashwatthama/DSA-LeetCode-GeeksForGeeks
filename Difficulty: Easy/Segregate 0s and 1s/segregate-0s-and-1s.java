class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;
        int low =0,high=n-1;
        while(low<high){
        if(arr[low]==0){
            low++;
        } else if(arr[low]==1){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
       
        }
        }
            
    }
    
}
