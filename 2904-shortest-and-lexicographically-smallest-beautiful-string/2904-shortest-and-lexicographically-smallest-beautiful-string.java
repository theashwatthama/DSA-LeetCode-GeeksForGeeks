class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int low=0;
        int high=0;
        int count=0;
        String res="";
        while(high<n){
            if(s.charAt(high)=='1'){
                count++;
            }
            while(count==k){
                int length=high-low+1;
                String candidate = s.substring(low, high + 1);
                if(res.equals("") || length < res.length() ||
                (length == res.length() && candidate.compareTo(res) < 0)) {
                res = candidate;
                }
                if(s.charAt(low)=='1'){
                    count--;
                }
                low++;
            }
            high++;
        }
        return res;
    }
}