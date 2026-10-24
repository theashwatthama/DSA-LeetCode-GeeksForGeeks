class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int ariveAliceDate=fun(arriveAlice);
        int leaveAliceDate=fun(leaveAlice);
        int arriveBobDate=fun(arriveBob);
        int leaveBobDate=fun(leaveBob);

        int start=Math.max(ariveAliceDate,arriveBobDate);
        int end=Math.min(leaveAliceDate, leaveBobDate);

        return Math.max(0, end-start+1);
    }
    public int fun(String date){
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int month=Integer.parseInt(date.substring(0,2));
        int day=Integer.parseInt(date.substring(3,5));

        int total=day;
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        return total;
    }
}