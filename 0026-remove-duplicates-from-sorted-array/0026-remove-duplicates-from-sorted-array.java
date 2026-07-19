class Solution {
    public int removeDuplicates(int[] nums) {
       int n=nums.length;
       int unique=1;
       int j=0;
       int count=1;
       int i=0;
       while(j<n){
        if(nums[i]==nums[j]){
            j++;
            continue;
        }
        nums[unique]=nums[j];
        unique++;
        count++;
        j++;
        i++;
       }
       return count;
    }
}