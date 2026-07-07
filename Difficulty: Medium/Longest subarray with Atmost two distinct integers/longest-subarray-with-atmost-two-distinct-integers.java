class Solution {
    public int totalElements(int[] arr) {
        // code here
         int n = arr.length;
        int left=0;
        int right=0;
        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            map.put(arr[right],map.getOrDefault(arr[right],0)+1);
            while(map.size()>2){
                map.put(arr[left],map.get(arr[left])-1);
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            if(map.size()<2 || map.size()==2){
                int length=right-left+1;
                ans=Math.max(ans,length);
            }
            right++;
        }
        return ans;
    }
}