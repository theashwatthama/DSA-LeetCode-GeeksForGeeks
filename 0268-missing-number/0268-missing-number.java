class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            int num=nums[i];
            if(count!=num){
                return count;
            }
            count++;  
        }
        return count;
    }
}