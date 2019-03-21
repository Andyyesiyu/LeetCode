class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = prices[1] - prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - minPrice;
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        if (maxProfit < 0) {
            maxProfit = 0;
        }
        return maxProfit;
    }
}