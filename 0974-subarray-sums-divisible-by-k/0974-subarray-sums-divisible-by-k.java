class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int n =nums.length;
        int res=0;
        int rem=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            rem=sum%k;
            if(rem<0){
                rem=rem+k;
            }
            int freq=map.getOrDefault(rem,0);
            res+=freq;
            map.put(rem,map.getOrDefault(rem,0)+1);

        }
        return res;
    }
}