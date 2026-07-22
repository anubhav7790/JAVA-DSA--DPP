class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        while (k-- > 0) {
            for (int i = 0; i < m; i++) {
                int temp = grid[i][n - 1];

                for (int j = n - 1; j > 0; j--) {
                    grid[i][j] = grid[i][j - 1];
                }

                grid[i][0] = temp;
            }

            int temp1 = grid[m - 1][0];
            for (int i = m - 1; i > 0; i--) {
                grid[i][0] = grid[i - 1][0];
            }
            grid[0][0] = temp1;

        }

        List<List<Integer>> l = new ArrayList<>() ; 
        for(int i = 0 ; i<m ; i++){
            List<Integer> row = new ArrayList<>() ; 
            for(int j = 0 ; j<n ; j++){
                row.add(grid[i][j]) ; 
            }
            l.add(row) ; 
        }

        return l ; 
    }

}