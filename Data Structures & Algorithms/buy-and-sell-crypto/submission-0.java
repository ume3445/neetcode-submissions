class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            int j = i + 1;
            if ((prices[j] - prices[i]) > 0) {
                int temp = prices[j] - prices[i];
                maxProfit += temp;
            } else {
                continue;
            }
        }
        return maxProfit;
    }
}
