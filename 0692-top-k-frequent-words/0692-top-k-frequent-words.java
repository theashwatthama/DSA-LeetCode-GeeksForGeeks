class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n=words.length;
        HashMap<String ,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<Pair>pq=new PriorityQueue<>(
            (a,b) -> {
                if(a.first!=b.first){
                    return a.first-b.first;
                } return b.second.compareTo(a.second);
            }
        );

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            String word=entry.getKey();
            int freq=entry.getValue();

            Pair current =new Pair(freq,word);

            if(pq.size()<k){
                pq.add(current);
                continue;
            }

            if(current.first>pq.peek().first || (current.first==pq.peek().first && current.second.compareTo(pq.peek().second)<0)){
                pq.poll();
                pq.add(current);
            }
        }
            List<String> list =new ArrayList<>();
            while(!pq.isEmpty()){
                list.add(pq.poll().second);
            }

            Collections.reverse(list);
            return list;


    }

    class Pair{
        int first;
        String second;
        Pair(int f,String s){
            first=f;
            second=s;
        }
    }
}