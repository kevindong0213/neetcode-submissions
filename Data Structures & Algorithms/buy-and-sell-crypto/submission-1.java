class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, sell = 1;
        int maxProfit = 0;
        // while (sell < prices.length) {
        //     int profit = prices[sell] - prices[buy]; 
        //     if (maxProfit < profit) {
        //         maxProfit = profit;
        //     } else {
        //         buy++;
        //     }
        //     sell++;

        // }
        while (sell < prices.length) {
            if (prices[sell] < prices[buy]) {
                // 找到更便宜的買點，直接換過去
                buy = sell;
            } else {
                int profit = prices[sell] - prices[buy];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
            sell++;
        }
        return maxProfit;
    }
}
