class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int minutes = 0;

        // Put all rotten oranges in queue, count fresh
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j, 0});
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            int t = curr[2];

            // update max minutes
            if (t > minutes) {
                minutes = t;
            }

            // check DOWN
            if (r + 1 < rows && grid[r + 1][c] == 1) {
                grid[r + 1][c] = 2;
                fresh--;
                q.add(new int[]{r + 1, c, t + 1});
            }

            // check UP
            if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                grid[r - 1][c] = 2;
                fresh--;
                q.add(new int[]{r - 1, c, t + 1});
            }

            // check RIGHT
            if (c + 1 < cols && grid[r][c + 1] == 1) {
                grid[r][c + 1] = 2;
                fresh--;
                q.add(new int[]{r, c + 1, t + 1});
            }

            // check LEFT
            if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                grid[r][c - 1] = 2;
                fresh--;
                q.add(new int[]{r, c - 1, t + 1});
            }
        }

        if (fresh == 0) {
            return minutes;
        }
        return -1;
    }
}
