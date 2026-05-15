class Solution {

    public boolean helper(char board[][] , int row , int col , char dig) {

        if(dig =='.') return true ; 
         //row 
         for(int i = 0 ; i< 9 ; i++) {
           // skip for already
            if(i != col && board[row][i] == dig) return false ; 
         }

         //col
         for(int j = 0 ; j< 9 ; j++) {
            if( j != row && board[j][col] == dig) return false ; 
         } 

         //grid 
         int srow = (row/3)*3 ;
         int scol =  (col/3)*3 ; 
         
        for(int m = srow ; m<= srow+2 ; m++){
            for(int n = scol ; n<= scol+2 ; n++){
                if((m != row || n != col )&&board[m][n] == dig) return false ;
        }

    }

      return true ; 
    }
    public boolean isValidSudoku(char[][] board) {
        int row = 9 , col = 9 ; 
        for( int i = 0 ; i< row ; i++){
            for(int j =0 ; j<col ; j++){
               if( helper(board , i , j , board[i][j] )) continue ; 
               else return false ; 
            }
        }

        return true ; 
    }

    
}