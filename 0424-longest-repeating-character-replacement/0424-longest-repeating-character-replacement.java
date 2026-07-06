class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left=0;
        int res=Integer.MIN_VALUE;
        int maxcount=0;
        int [] f =new int [256];
        for(int right=0;right<n;right++){
            f[s.charAt(right)]++;
            maxcount=Math.max(maxcount,f[s.charAt(right)]);
            int length=right-left+1;
            int diff=length-maxcount;
            while(diff>k){
                f[s.charAt(left)]--;
                left++;
                length=right-left+1;
                diff=length-maxcount;
            }
            length=right-left+1;
            res=Math.max(res,length);
        }
       return res;
    }
}