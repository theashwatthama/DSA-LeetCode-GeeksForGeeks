class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int low =0,high=k-1,res=0,sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        res=sum;
        while(high<n){
            res=Math.max(res,sum);
            low++;
            high++;
            if(high==n){
                break;
            }
            sum=sum-arr[low-1];
            sum=sum+arr[high];
        }
        return res;
    }
}