class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int n = s.length();
        int left=0;
        int right=0;
        int ans =-1;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<n){
            char ch = s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while (map.size()>k){
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                if(map.get(leftchar)==0){
                    map.remove(leftchar);
                }
                left++;
            }
            if (map.size()==k){
                ans=Math.max(ans,right-left+1);
            }
            right++;
        }
        return ans;
    }
}