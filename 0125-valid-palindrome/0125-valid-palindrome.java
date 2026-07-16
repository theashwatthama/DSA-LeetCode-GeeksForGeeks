class Solution {
    public boolean isPalindrome(String s) {
       String sb=s;
        sb=sb.replaceAll("[^a-zA-Z0-9]", "");
        sb = sb.toLowerCase();
        int n=sb.length();
        int left=0;
        int right=n-1;
        if(sb.isEmpty()){
            return true;
        }
        while(left<right){
            if(sb.charAt(left)==sb.charAt(right)){
                left++;
                right--;
            } else if (sb.charAt(left)!=sb.charAt(right)) {
                return false;
            }
        }
        return true; 
    }
}