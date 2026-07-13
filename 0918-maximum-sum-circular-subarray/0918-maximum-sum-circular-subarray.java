class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxbestend=nums[0];
        int minbestend=nums[0];
        int prevmaxbest=0;
        int prevminbest=0;
        int maxsum=nums[0];
        int minsum=nums[0];
        int totalsum=nums[0];
        int res=nums[0];
        for(int i =1;i<n;i++){
            prevmaxbest=maxbestend;
            prevminbest=minbestend;
            int v1=prevmaxbest+nums[i];
            int v2=prevminbest+nums[i];
            int v3=nums[i];

            maxbestend=Math.max(v1,v3);
            minbestend=Math.min(v2,v3);

            totalsum=totalsum+nums[i];

            maxsum=Math.max(maxsum,maxbestend);
            minsum=Math.min(minsum,minbestend);
        }
            if(maxsum<0){
                return maxsum;
            }
            return Math.max(maxsum,totalsum-minsum);
    }
}