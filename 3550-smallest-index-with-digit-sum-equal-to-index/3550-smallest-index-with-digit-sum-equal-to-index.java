class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(fun(nums[i])==i){
                return i;
            }
        }
        return -1;
    }

    public int fun(int m){
        int sum=0;
        while(m>0){
            sum+=m%10;
            m=m/10;
        }
        return sum;
    }
}