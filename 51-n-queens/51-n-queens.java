class Solution {
    
    
    public void queen(int row , int[][] chess, List<List<String>> ans){
        if(row == chess.length){
            List<String> dummy  = new ArrayList<>();
            for(int i = 0 ; i <chess.length; i++)
                {
                
                String s = "";
                for(int j = 0 ; j<chess[0].length; j++){
                    if(chess[i][j] == 1) s+='Q';
                    else s+= '.';
                    
                }
                dummy.add(s);
               
                
                }
            
            ans.add(dummy);
            
            return;
        }
        for(int col  =0 ; col < chess.length; col ++){
            if(isSafe(row, col,chess)){
                chess[row][col]  = 1;
                queen(row+1,chess,ans);
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
    
    
    public List<List<String>> solveNQueens(int n) {
        int[][] mat = new int[n][n];
        List<List<String>> ans = new ArrayList<>();
        queen(0 , mat , ans);
        
        return ans;
    }
}