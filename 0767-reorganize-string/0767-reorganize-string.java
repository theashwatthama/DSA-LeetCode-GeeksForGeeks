import java.util.*;

class Solution {

    public String reorganizeString(String s) {

        // 1. Frequency count
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // 2. Max Heap based on frequency
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> b.freq - a.freq
        );

        // 3. Put all characters in heap
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder ans = new StringBuilder();

        // Previous character
        Pair prev = null;

        while (!pq.isEmpty()) {

            Pair current = pq.poll();

            // Previous character same hai
            if (prev != null && current.ch == prev.ch) {

                // Koi second character available nahi hai
                if (pq.isEmpty()) {
                    return "";
                }

                // Next most frequent character lo
                Pair next = pq.poll();

                ans.append(next.ch);
                next.freq--;

                // next ab previous banega
                prev = next;

                // Agar frequency bachi hai toh heap mein wapas
                if (next.freq > 0) {
                    pq.add(next);
                }

                // current ko bhi heap mein wapas daal do
                pq.add(current);

            } else {

                ans.append(current.ch);
                current.freq--;

                prev = current;

                if (current.freq > 0) {
                    pq.add(current);
                }
            }
        }

        return ans.toString();
    }

    class Pair {

        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }
}