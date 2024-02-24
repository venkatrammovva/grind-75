package sol_004_buy_and_sell_stock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock
public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int[] rightMax = new int[prices.length + 1];
        rightMax[prices.length] = -1;
        for(int i = prices.length-1; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], prices[i]);
        }
        int gMax = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            int rm = rightMax[i];
            int curr = rm - prices[i];
            gMax = Math.max(curr, gMax);
        }
        return gMax;
    }
}
