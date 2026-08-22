class Solution {
    public boolean checkDivisibility(int n) {
        int x=n;
        int sum=0;
        int product=1;
        while(x>0){
            int m=x%10;
            sum+=m;
            product*=m;
            x=x/10;
        }
        int totalSum=sum+product;
        if(n%totalSum==0){
            return true;
        }
        return false;
    }
}