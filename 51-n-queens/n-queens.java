class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<List<String>> l = new ArrayList<>(); 
       String board [][] = new String[n][n] ;

       for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<n ; j++){
            board[i][j] ="." ; 
        }
       }
       nqueen(l , board , 0) ; 
       return l ; 

    }

    public boolean isSafe(String board[][] , int row , int col){
        for(int i = row-1 ; i>=0 ; i--){
            if(board[i][col].equals("Q")) return false ; 
        }

        for(int i = row-1 , j = col-1 ; i>=0 && j>=0 ; i-- ,j--){
            if(board[i][j].equals("Q")) return false ;

        }

        for(int i = row-1 , j = col+1 ; i>=0 && j<board.length ; i-- ,j++){
            if(board[i][j].equals("Q")) return false ;

        }

        return true ; 
    }

    public void nqueen(List<List<String>> l , String board[][] , int row ){
        if(row == board.length ){
            List<String> curr = new ArrayList<>(); 
            for(int i = 0;  i<board.length ; i++){
                String s =""; 
                for(int j = 0; j<board.length ; j++){
                    s  = s+board[i][j] ;
                }
                curr.add(s) ; 
            }
            l.add(curr) ; 
             return ; 
        }
        for(int col = 0 ; col<board.length ; col++){
            if(isSafe(board , row , col)){
                board[row][col] ="Q"; 

                nqueen( l, board , row+1) ;
                board[row][col] ="." ; 
            }
        }
    }

}