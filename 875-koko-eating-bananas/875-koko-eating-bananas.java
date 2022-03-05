class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int s = 1  , e = piles[piles.length-1];
        int ans=0;
        while(s<=e){
            int speed = s + (e-s)/2;
            int time = 0;
            for(int v : piles){
                time+= Math.ceil((v*1.0 )/speed);
            }
            
            // if(time == h) return speed;
            if(time <= h){
                ans = speed;
                e = speed-1;
            }else s = speed+1;
        }
        return ans;
    }
}