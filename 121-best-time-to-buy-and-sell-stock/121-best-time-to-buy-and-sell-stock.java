class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        // int sell = prices[0];
        int max = 0;
        for(int v : prices){
            if(v > buy){
                max = Math.max(max , v-buy);
            }else
                buy = v;
        }
        return max;
    }
}