// 122. Best Time to Buy and Sell Stock II
class Solution {
    public int maxProfit(int[] prices) {
        Boolean buy = true;
        int profit = 0;
        int currBuy = 0;
        if (prices.length < 2) {
            return profit;
        }
        //pointers
        int j = 0;
        for (int i = 1; i < prices.length; i++) {
            //buy
            if (prices[j] < prices[i] && buy) {
                currBuy = prices[j];
                buy = false;
            }
            //sell
            if (prices[j] > prices[i] && !buy) {
                buy = true;
                profit += (prices[j] - currBuy);
            }
            j++;
        }
        if (!buy) {
            profit += (prices[j] - currBuy);
        }
        return profit;
    }
}