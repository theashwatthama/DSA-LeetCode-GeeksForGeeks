class Solution {
    public int reverse(int x) {
        int empty = 0;
        int reverse = 0;

        while (x != 0) {
            empty = x % 10;

            if (reverse > Integer.MAX_VALUE / 10 ||
                reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = reverse * 10 + empty;
            x = x / 10;
        }

        return reverse;
    }
}