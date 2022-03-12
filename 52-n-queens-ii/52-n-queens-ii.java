class Solution {
    
    int c;
    public void queen(int row , int[][] chess){
        if(row == chess.length){
            c += 1;
            return;
        }
        for(int col  =0 ; col < chess.length; col ++){
            if(isSafe(row, col,chess)){
                chess[row][col]  = 1;
                queen(row+1,chess);
                chess[row][col]  =0 ;
            }
        }
    }
    public boolean isSafe(int row ,int col,int[][] chess){
        
        //col
        for(int i = row-1 ; i>=0 ; i--)
            if(chess[i][col] == 1) return false;
        
        //right diagonal
        for(int i = row-1, j = col+1; i>=0 && j<chess.length ; i--,j++)
            if(chess[i][j] == 1) return false;
        
        //left diagonal
        for(int i = row-1, j = col-1; i>=0 && j>=0 ; i--,j--)
            if(chess[i][j] == 1) return false;
        
        return true;
        
        
    }
    
    
    public int totalNQueens(int n) {
        int[][] mat = new int[n][n];
        c = 0 ;
        // List<List<String>> ans = new ArrayList<>();
        queen(0 , mat );
        // System.out.println(c);
        return c;
    }
}