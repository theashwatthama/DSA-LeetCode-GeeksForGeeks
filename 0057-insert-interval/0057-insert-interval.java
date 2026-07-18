class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         List<int[]> temp = new ArrayList<>();
        int n= intervals.length;
        boolean insert=false;
        for (int i = 0; i <n ; i++) {
            int start=intervals[i][0];
            if(insert==false && start>=newInterval[0]){
                temp.add(newInterval);
                insert=true;
            } 
            temp.add(intervals[i]);
        }
        if(insert==false){
            temp.add(newInterval);
        }
        List<int[]> res = new ArrayList<>();

        int start1=temp.get(0)[0];
        int end1=temp.get(0)[1];
        int max=0;
        for(int i=1;i<temp.size();i++){
            int start2=temp.get(i)[0];
            int end2=temp.get(i)[1];

            if(end1>=start2){
            end1=Math.max(end1,end2);
            continue;
            }
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }
}