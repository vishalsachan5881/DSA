class Solution {
    public int maxProfit(int[] prices) {
        
        int minsofar = Integer.MAX_VALUE;
        int ans = 0;
        for(var v : prices){
            if(v<minsofar) minsofar = v;
            int soldtoday = v-minsofar;
            ans = Math.max(ans,soldtoday);
        }
        return ans;
    }
}