class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int profit = 0;
        int maxprofit = 0;
        for (int j = i + 1; j < prices.length; j++) {
            profit = prices[j] - prices[i];
            if (profit > maxprofit) {
                maxprofit = profit;
            }
            if (prices[j] < prices[i]) {
                i = j;
            }
        }
        return maxprofit;
    }
}