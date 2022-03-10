// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static void path(int[][] m, int row , int col , String psf, ArrayList<String> ans, boolean[][] visited){
        
        if(row < 0 || col < 0 || row == m.length || col == m[0].length || m[row][col] == 0 || visited[row][col] == true)
        return ;
        
        if(row == m.length -1 && col == m[0].length-1) {
            // System.out.println(psf);
            ans.add(psf);
            return;
        }
        
        
        
        
        visited[row][col] = true;
        
        
        path(m, row-1, col, psf+"U",ans,visited);
        path(m, row+1, col, psf+"D",ans,visited);
        path(m, row, col+1, psf+"R",ans,visited);
        path(m, row, col-1, psf+"L",ans,visited);
        
        visited[row][col]  = false;
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
            ArrayList<String> ans = new ArrayList<>();
            boolean[][] visited = new boolean[m.length][m[0].length];
            path(m, 0, 0 , "",ans,visited);
            
            return ans;
    }
}