class Solution {
    public boolean isSafe(int n, int r, int c){
        if(r < 0 || c < 0 || r >= n|| c>=n)
            return false;
        else
        return true;
    }
    public double knightProbability(int n, int k, int ro, int column) {
        double[][] curr = new double[n][n];
        double[][] next = new double[n][n];
        curr[ro][column] = 1;
        for(int m = 0 ; m<k;m++){
            for(int row = 0; row< n; row++){
                for(int col = 0 ; col< n ;col++){
                    if(curr[row][col] != 0){        
                        
                        //1st mov
                        if(isSafe(n,row-2,col+1))
                            next[row-2][col+1] += curr[row][col]/8.0;
                        //2nd mov
                        if(isSafe(n,row-1,col+2))
                            next[row-1][col+2] += curr[row][col]/8.0;
                        //3rd mov
                        if(isSafe(n,row+1,col+2))
                            next[row+1][col+2] += curr[row][col]/8.0;
                        //4th mov
                        if(isSafe(n,row+2,col+1))
                            next[row+2][col+1] += curr[row][col]/8.0;
                        //5th mov
                        if(isSafe(n,row+2,col-1))
                            next[row+2][col-1] += curr[row][col]/8.0;
                        //6th mov
                        if(isSafe(n,row+1,col-2))
                            next[row+1][col-2] += curr[row][col]/8.0;
                        //7th mov
                        if(isSafe(n,row-1,col-2))
                            next[row-1][col-2] += curr[row][col]/8.0;
                        //8th mov
                        if(isSafe(n,row-2,col-1))
                            next[row-2][col-1] += curr[row][col]/8.0;
                     }
                }
            }
            
            curr = next;
            next = new double[n][n];
            
            
        }
        
        double sum = 0 ;
        for(int i = 0 ; i< n ; i++)
            for(int j = 0 ; j < n ; j++)
                sum += curr[i][j];
      return sum;
    }
}