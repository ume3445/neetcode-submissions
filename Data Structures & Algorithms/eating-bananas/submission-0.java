class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPiles = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxPiles = Math.max(maxPiles, piles[i]);
        }

        int right = maxPiles;
        int left = 1;

        while (left <= right) {
            int mid = left + (right - left) /2;
            int temp = 0;
            for (int i = 0; i < piles.length; i++) {
                int temp1 = (piles[i] + mid - 1) / mid;
                temp += temp1;
            }

            if (temp <= h) {
                right = mid - 1;
                res = Math.min(mid,res);
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}
