class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> neg = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();

        for (int num :nums){
            if (num<0){
                neg.add(num);
            } else pos.add(num);
        }

        if (neg.isEmpty()){
            for (int i = 0; i <pos.size() ; i++) {
                pos.set(i, pos.get(i)* pos.get(i));
            }
           return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        if (pos.isEmpty()){
            for (int i = 0; i <neg.size() ; i++) {
                neg.set(i, neg.get(i)* neg.get(i));
            }
            Collections.sort(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        int i=0, j=0, id=0;
        int n = neg.size();
        int p = pos.size();

        int[] res = new int[n+p];

        //For negative
        for ( i = 0; i < n ; i++) {
            neg.set(i, neg.get(i)* neg.get(i));
        }  Collections.sort(neg);

        for ( i = 0; i <p ; i++) {
            pos.set(i,pos.get(i)*pos.get(i));
        }

        i=0;

        while(i<n&&j<p){
            if (neg.get(i)< pos.get(j)){
                res[id]=neg.get(i);
                id++;
                i++;
            } else {
                res[id]=pos.get(j);
                id++;
                j++;
            }
        }
        while (i<n){
            res[id++]= neg.get(i);
        i++;
        }

        while (j<p){
            res[id++]= pos.get(j);
            j++;
        }
        return res;
    }
}