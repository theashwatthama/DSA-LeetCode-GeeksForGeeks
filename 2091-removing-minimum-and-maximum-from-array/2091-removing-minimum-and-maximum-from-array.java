class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        int min=nums[0];
        int currmax=0;
        int currmin=0;
        int secmax=0;
        int secmin=0;
        int count=0;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        for(int i=0;i<n;i++){
            if(max==nums[i]){
                currmax=i+1;
            }else if(min==nums[i]){
                currmin=i+1;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(max==nums[i]){
                secmax=n-i;
            } else if(min==nums[i]){
                secmin=n-i;
            }
        }

        int ans1 = Math.max(currmax, currmin);
        int ans2 = Math.max(secmax, secmin);
        int ans3 = currmax + secmin;
        int ans4 = currmin + secmax;

        return Math.min(Math.min(ans1, ans2),Math.min(ans3, ans4));
    }
}