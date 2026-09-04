class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int res=-1;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            int min=fun(nums,i);
            if(max-min<=k){
                res=i;
                return res;                  
            }
    }
    return res;
    }  
    public int fun(int[] arr,int m){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=m;i<n;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}