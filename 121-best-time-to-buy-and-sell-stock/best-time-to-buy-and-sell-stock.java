class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int r=0;

        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            r=Math.max(r,prices[i]-min);
        }

        return r;
    }
}