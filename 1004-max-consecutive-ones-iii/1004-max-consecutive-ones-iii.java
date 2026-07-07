class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left=0;
        int right=0;
        int res =0;
        int length=0;
         int zerocount=0;
        for(right=0;right<n;right++){
            if(nums[right]==0){
            zerocount++;
            }
            while(zerocount>k){
               if(nums[left]==0){
                zerocount--;
               }
               left++; 
            }
            length=right-left+1;
            res=Math.max(res,length);
        }
        return res;
    }
}