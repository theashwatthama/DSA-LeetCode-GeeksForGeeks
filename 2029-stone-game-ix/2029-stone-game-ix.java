class Solution {
    public boolean stoneGameIX(int[] stones) {
         int[] count = new int[3];

        // Count remainders: 0, 1, 2
        for (int stone : stones) {
            count[stone % 3]++;
        }

        // Even number of 0-remainder stones
        if (count[0] % 2 == 0) {
            return count[1] > 0 && count[2] > 0;
        }

        // Odd number of 0-remainder stones
        return Math.abs(count[1] - count[2]) > 2;
    }
}