class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> freq=new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());

        int m=freq.size();
        int ans=0;
        int count=0;
        for(int i=0;i<m;i++){
            if(i<8){
                count=freq.get(i)*1;
            }
  
            if(i>=8&&i<16){
                count=freq.get(i)*2;
            }

            if(i>=16&&i<24){
                count=freq.get(i)*3;
            }
            if(i>=24){
                count=freq.get(i)*4;
            }
             ans+=count;
        }
        
        return ans;
    }
}