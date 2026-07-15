class Solution {
    public boolean isPalindrome(int x) {
        int n =x;
        long reverse=0;
        while(n>0){
            int res=n%10;
            reverse=reverse*10+res;
            n=n/10;
        }
        if(reverse == x){
            return true;
        } else return false;
    }
}