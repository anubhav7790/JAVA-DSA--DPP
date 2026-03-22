class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0 ; i<4 ; i++){
            if(areEqual(mat , target)) return true ; 
            mat = rotate(mat) ; 
    }
    return false ; 
    }
    boolean areEqual(int [][] A , int [][] B ){
        int n = A.length ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] != B[i][j]) return false;
            }
        }
        return true;
    }

    int[][] rotate(int[][] mat){
        int n = mat.length ;
        int[][] rotated = new int[n][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = mat[i][j];
            }
        }
        return rotated;
    }

    

}