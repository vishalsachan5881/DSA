class Solution {
    public int numberOfMatches(int n) {
        int match =0;
        int ans=0;
        if(n==1) return 0;
        while(n!=1){
            if((n&1)==0){
                match = n/2;
                ans+=match;
                n/=2;
            }else{
                match = (n-1)/2;
                n = (n-1)/2 +1;
                ans+=match;
            }
        }
        return ans;
    }
}