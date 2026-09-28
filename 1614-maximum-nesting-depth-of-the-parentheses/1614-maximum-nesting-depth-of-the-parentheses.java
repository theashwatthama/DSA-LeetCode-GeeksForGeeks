class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int count=0;
        int res=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            res=Math.max(res,count);
            if(ch=='('){
                count++;
            } else if(ch==')'){
                count--;
            }
        }
        return res;
    }
}