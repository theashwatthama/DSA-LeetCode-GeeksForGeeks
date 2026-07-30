class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        boolean odd = false;
        int ans=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            if(freq%2==0){
                ans+=freq;
            } else{
                odd=true;
                ans=ans+freq-1;
            }
        }
        if(odd){
            ans++;
        }

return ans;
    }
}