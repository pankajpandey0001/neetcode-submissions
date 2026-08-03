class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, min = prices[0];
        for (int i=1; i<prices.length; i++) {
            if (min>prices[i]) {
                min = prices[i];
            }
            else {
                if (max < prices[i]-min) {
                    max = prices[i]-min;
                }
            }
        }
        return max;
    }
}
