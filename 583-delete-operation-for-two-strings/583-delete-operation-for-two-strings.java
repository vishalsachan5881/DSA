class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] t = new int[n+1][m+1];
        for(int i = 0 ; i<n+1;i++){
            for(int j = 0; j<m+1; j++){
                if(i==0 || j==0) t[i][j] = 0;
            }
        }
        
        for(int i = 1; i<n+1; i++)
            for(int j = 1; j<m+1; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    t[i][j] = 1+t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
            }
        //System.out.println(t[n][m]);
        
        return n+m-2*t[n][m];
        
    }
}



















// class Solution{
//     int longestCommonSubstr(String S1, String S2, int n, int m){
//         int [][] t = new int[n+1][m+1];
//         for(int i=0; i<n+1; i++)
//         {
//         for(int j=0 ;j <m+1; j++)
//         {
//             if(i==0 || j==0)
//             {
//                 t[i][j] = 0;
//             }
//         }
//         }
//         int max = 0;
//         for(int i=1; i<n+1; i++)
//         {
//         for(int j=1 ;j <m+1; j++)
//         {
            
//              if(S1.charAt(i-1) == S2.charAt(j-1))
//              {
//             t[i][j]  = 1 + t[i-1][j-1];
//             if(t[i][j] > max)
//             max = t[i][j];
//              }
//             else
//             t[i][j] = 0;
//         }
//         }
        
//         return max;
//     }
// }