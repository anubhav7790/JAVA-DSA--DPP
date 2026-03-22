class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowB = 0 ; 
        int rowE = matrix.length-1 ; 
        int colB = 0 ; 
        int colE = matrix[0].length-1  ; 
        List<Integer> l = new ArrayList<>(); 
        while(rowB<=rowE && colB <=colE){
            for(int j = colB ; j<=colE ; j++){
                l.add(matrix[rowB][j]) ; 
            }
            rowB++; 
            for(int k = rowB ; k<=rowE ; k++){
                l.add(matrix[k][colE]) ; 
            }
            colE--; 
            if(rowB<= rowE){
                for(int j = colE ; j>= colB ; j--){
                    l.add(matrix[rowE][j]) ; 
                }
            }
            rowE--; 
            if(colB<=colE){
                for(int i = rowE ; i>=rowB ; i--){
                    l.add(matrix[i][colB]) ; 
                }
            }
            colB++; 
        }

        return l; 
    }
}