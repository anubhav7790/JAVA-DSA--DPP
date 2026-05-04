class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length ;
        //Transpose 
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int k = 0 ; k<n; k++){
            swap(matrix , k , n-1) ; 
        }


    }

    public void swap(int matrix[][] , int row , int j){
        int i =0 ; 
        while(i<j){
            
            int tem = matrix[row][i] ; 
            matrix[row][i] = matrix[row][j] ;
            matrix[row][j] = tem ; 
            i++;
            j--; 
        }
    }
}