class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=nums.length;
        map.put(0,1);
        int res =0;
        int sum =0;
        int que=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            que=(sum-k);
            int freq=map.getOrDefault(que,0);
            res+=freq;
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}