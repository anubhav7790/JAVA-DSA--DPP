class Solution {
    public int[][] generateMatrix(int n) {
        int m = 1 ; 
        int  matrix[][] = new int[n][n] ; 
        int rowS = 0 ;
        int rowE = n-1 ; 
        int colS = 0 ;
        int colE = n-1 ; 
        while(rowS<=rowE && colS<= colE && m<=Math.pow(n,2)){
             for(int i = colS ; i<=colE ; i++){
                matrix[rowS][i] = m ; 
                m++; 
             }
             rowS++; 
             for(int j = rowS ; j<= rowE ; j++){
                matrix[j][colE] = m ; 
                m++; 
             }
             colE--; 
             if(rowS<=rowE){
                for(int i = colE ; i>=colS ; i-- ){
                    matrix[rowE][i] = m ;
                    m++; 
                }
             }
             rowE-- ;
             if(colS<=colE){
                for(int k = rowE ; k>=rowS ; k--){
                    matrix[k][colS] = m ; 
                    m++; 
                }
             }
             colS++; 
        }

        return matrix ; 
    }
}