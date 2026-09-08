class Solution {
    public int distinctSubseqII(String s) {
         long[] dp = new long[26];
        long total = 0;

        long MOD = 1000000007;

        for (char ch : s.toCharArray()) {

            int idx = ch - 'a';

            long newEnd = (total + 1) % MOD;

            total = (2 * total + 1 - dp[idx]) % MOD;

            if (total < 0) {
                total += MOD;
            }

            dp[idx] = newEnd;
        }

        return (int) total;
    }
}