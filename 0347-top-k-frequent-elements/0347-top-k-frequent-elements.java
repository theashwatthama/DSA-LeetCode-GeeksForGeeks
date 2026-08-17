import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.first - b.first
        );

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        int element = entry.getKey();
        int freq = entry.getValue();
        Pair current = new Pair(freq, element);
        if(pq.size()<k){
            pq.add(current);
            continue;
        }
        if(current.first<pq.peek().first){
            continue;
        }
        pq.poll();
        pq.add(current);
    }

  int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().second;
        }
         return ans;
    }

    class Pair {
    int first;
    int second;

    Pair(int f, int s) {
        first = f;
        second = s;
    }
}
}