class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        //ans[1] = 1;
        for(int i=1; i<n+1; i++){
            if( (i&1) ==0 ) ans[i] = ans[i>>1];
            else ans[i] = 1+ans[i>>1];
        }
        return ans;
    }
}