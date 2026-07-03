class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int n = nums.length;
        int low=0;
        int high=0;
        int res=Integer.MAX_VALUE;
        int sum =0;
        while(high<n){
            sum=sum+nums[high];
            while (sum>=target){
                int length=high-low+1;
                res=Math.min(res,length);
                sum=sum-nums[low];
                low++;
            } high++;
        } if (res==Integer.MAX_VALUE){
            return 0;
        } return res;
    }
}