class Solution {
    public int fn(String text1, String text2, int n1, int n2,int[][] t){
        if(n1==0 || n2 ==0) return 0;
        if(t[n1][n2] != -1) return t[n1][n2];
        if(text1.charAt(n1-1) == text2.charAt(n2-1)) return t[n1][n2] = 1+fn(text1,text2,n1-1,n2-1,t);
        else return t[n1][n2] = Math.max(
        fn(text1,text2,n1,n2-1,t),fn(text1,text2,n1-1,n2,t));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int t[][] = new int[1001][1001];
        for(int i = 0 ; i<1001; i++)
            for(int j = 0 ; j<1001; j++)
                t[i][j] = -1;
        return fn(text1,text2,n1,n2,t);
    }
}