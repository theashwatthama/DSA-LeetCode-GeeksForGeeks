class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0){
        return "";
        }
        int n=s.length(); 
        int[] f=new int[128];
        for(char c :t.toCharArray()){
        f[c]++;
        }

        int required=t.length();
        int left=0;
        int right=0;
        int minl=Integer.MAX_VALUE;
        int start=0;
        while(right<n){
            int r=s.charAt(right);
            if(f[r]>0){
                required--;
            }
            f[r]--;
            right++;
            while(required==0){
                int l =s.charAt(left);
                if(right-left<minl){
                    minl=right-left;
                    start=left;
                }
                f[l]++;
                if(f[l]>0){
                    required++;
                }
                left++;
            }
        }

        if(minl==Integer.MAX_VALUE){
                return "";
            }

        return s.substring(start,start+minl);

    }
}