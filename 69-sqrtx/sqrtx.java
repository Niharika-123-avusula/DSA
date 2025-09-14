class Solution {
    public int mySqrt(int x) {
        int y = 0;
        if (x == 0 || x == 1) {
            return x;
        }
        for (int i = 1; i <= x / 2; i++) {
            long sq = (long) i * i;
            if (sq == x) {
                return i;
            } else if (sq > x) {
                return i - 1;
            }
            y = i; // keep track of last valid i
        }
        return y;
    }
}
