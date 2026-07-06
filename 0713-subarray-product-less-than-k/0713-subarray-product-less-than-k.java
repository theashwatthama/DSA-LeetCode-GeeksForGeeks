class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left=0;
        int right =0;
        int ans=0;
        long product=1;
        int len=0;
        if(k<=1){
            return 0;
        }
        for(right=0;right<n;right++){
            product=product*nums[right];
            while(product>=k){
                product=product/nums[left];
                left++;
            }
            len=right-left+1;
            ans=ans+len;
            
        }
        return ans;
   
    }
}