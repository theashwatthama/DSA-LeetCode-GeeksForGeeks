class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int nodelete=arr[0];
        int onedelete=Integer.MIN_VALUE;
        int res=arr[0];
        for(int i =1;i<n;i++){
            int pervnodelete=nodelete;
            nodelete=Math.max(arr[i],nodelete+arr[i]);
            if(onedelete==Integer.MIN_VALUE){
                onedelete=0;
            }
            onedelete=Math.max(pervnodelete,onedelete+arr[i]);
            res=Math.max(res,Math.max(nodelete,onedelete));
        }
        return res;
    }
}