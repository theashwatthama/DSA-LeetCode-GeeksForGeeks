class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int n= a.length;
        int bestend=a[0];
        int res=a[0];
        for(int i=1;i<n;i++){
            int v1=bestend+a[i];
            int v2=a[i];
            bestend=Math.min(v1,v2);
            res=Math.min(res,bestend);
        }
        return res;
    }
}