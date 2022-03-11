class Solution {
    public static int lcs(String s, String ss , int n ,int m,int[][] dp){
            
        for(int i = 0; i<n+1; i++){
            dp[0][i] = 0;
            dp[i][0] = 0;
        }
        
        for(int i = 1; i<n+1; i++){
            for(int j = 1 ; j<n+1; j++){
                if(s.charAt(i-1)==ss.charAt(j-1))
                   {dp[i][j] = 1 + dp[i-1][j-1];}
                else
               { dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);}
            }
        }
        
                   return dp[n][m];
            
    }
            
        
        
 
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[1001][1001];
        int n =  s.length();
        dp = new int[n+1][n+1];
        String ss= "";
        for(int i = n-1; i>=0; i--)
              ss += s.charAt(i);
        
        return lcs(s,ss,n,n,dp);
        }
}