class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int n=piles.length;
       int low=1;
       int high=0;
       for(int i=0;i<n;i++){
        high=Math.max(high,piles[i]);
       } 
       int res=-1;
       while(low<=high){
        int guess=(low+high)/2;
        long hours=fun(piles,h,guess);
        if(hours>h){
            low=guess+1;
        } else {
            res=guess;
            high=guess-1;
        }
       }
       return res;
    }

    public long fun(int[]a,int guard,int speed){
    long x=0;
    for(int i=0;i<a.length;i++ ){
       x=x+a[i]/speed;
       if(a[i]%speed!=0){
        x++;
       } 
    }
    return x;
    }
}
