class Solution {
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;

        for (int k = 1; k <= n; k++) {
            if (n % k != 0) continue;
            if (isSortable(nums, n, k)) ans += k;
        }
        return ans;
    }

    private boolean isSortable(int[] a, int n, int k) {
        int prevMax = Integer.MIN_VALUE;

        for (int start = 0; start < n; start += k) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            int descents = 0;

            for (int i = 0; i < k; i++) {
                int cur = a[start + i];
                int next = a[start + (i + 1) % k]; // cyclic neighbour
                if (cur > next) descents++;
                min = Math.min(min, cur);
                max = Math.max(max, cur);
            }

            if (descents > 1) return false;   // rotated sorted nahi hai
            if (prevMax > min) return false;  // blocks ke beech order toot gaya

            prevMax = max;
        }
        return true;
    }
}