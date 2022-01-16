class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
        Arrays.sort(piles);
        int ans = -1 ;
        int s = 0 , end = piles[n-1];
        while(s <= end) {
            int mid = s + (end - s)/2;
            int t = 0;
            for(var v : piles){
                t += Math.ceil((double) v / (double) mid);
            }
            
           if(t<= h){
               ans = mid;
               end = mid-1;
           }else s = mid+1;
        
        }
        return ans;
        
        
        
    }
}