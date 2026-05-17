class Solution {
    public boolean build(char[][] board , int row , int col){
        int nextrow = row , nextcol = col+1 ; 
        if(row == 9 ) return true ;
        if(nextcol == 9){
            nextrow = row+1 ;
            nextcol = 0 ; 
        } 
        if(board[row][col] != '.'){
            return build(board , nextrow , nextcol) ; 
        }
        for(char i ='1' ; i<='9' ; i++){
            if(isValid(board , row , col , i)){
                board[row][col] = i ; 
                if(build(board , nextrow , nextcol)) return true ; 

                //backtrack 
                board[row][col] ='.' ; 
            }
        }
       return false ; 
    }
    public boolean isValid(char[][] board , int row , int col , char c ){
        //same row 
        for(int i = 0 ; i<board.length ; i++){
            if(board[row][i] == c) return false ; 
        }

        //same col 
        for(int j = 0 ; j<board.length ; j++){
            if(board[j][col] == c) return false ; 
        }

        //same grid 
        int srow = (row/3)*3 ;
        int scol = (col/3)*3 ; 
        for(int m = srow ; m<= srow+2 ; m++){
            for(int n = scol ; n<=scol+2 ; n++){
                if(board[m][n] == c) return false ; 
            }
        }

        return true ; 
    }
    public void solveSudoku(char[][] board) {
        build(board , 0 , 0) ; 

    }
}