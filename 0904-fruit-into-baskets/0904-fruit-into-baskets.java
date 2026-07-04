class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left=0;
        int right=0;
        int ans=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(right<n){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            while(map.size()>2){
                map.put(fruits[left],map.get(fruits[left])-1);
                if(map.get(fruits[left])==0){
                    map.remove(fruits[left]);
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