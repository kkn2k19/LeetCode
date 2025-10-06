// NOT FINISHED ///

public class H_778_SwimInRisingWater {
    public static int swimInWater(int[][] grid) {
        int n = grid.length;
        int[] curr = { 0, 0 };
        // int[] l = {-1,-1};
        // int[] r = {0,1 };
        // int[] u = {-1, -1};
        // int[] d = {1,0};
        int steps = grid[0][0];
        boolean[][] visited = new boolean[n][n];
        int[] lastIndex = { n - 1, n - 1 };
        while (curr[0] != lastIndex[0] && curr[1] != lastIndex[1]) {
            visited[curr[0]][curr[1]] = true;
            int min = Integer.MAX_VALUE;
            int nextRow = -1;
            int nextCol = -1;

            // check UP
            if (curr[0] > 0 && !visited[curr[0] - 1][curr[1]]) {
                if (grid[curr[0] - 1][curr[1]] < min) {
                    min = grid[curr[0] - 1][curr[1]];
                    nextRow = curr[0] - 1;
                    nextCol = curr[1];
                }
            }

            // check DOWN
            if (curr[0] < n - 1 && !visited[curr[0] + 1][curr[1]]) {
                if (grid[curr[0] + 1][curr[1]] < min) {
                    min = grid[curr[0] + 1][curr[1]];
                    nextRow = curr[0] + 1;
                    nextCol = curr[1];
                }
            }

            // check LEFT
            if (curr[1] > 0 && !visited[curr[0]][curr[1] - 1]) {
                if (grid[curr[0]][curr[1] - 1] < min) {
                    min = grid[curr[0]][curr[1] - 1];
                    nextRow = curr[0];
                    nextCol = curr[1] - 1;
                }
            }

            // check RIGHT
            if (curr[1] < n - 1 && !visited[curr[0]][curr[1] + 1]) {
                if (grid[curr[0]][curr[1] + 1] < min) {
                    min = grid[curr[0]][curr[1] + 1];
                    nextRow = curr[0];
                    nextCol = curr[1] + 1;
                }
            }

            if (nextRow == -1)
                break; // not updated

            curr[0] = nextRow;
            curr[1] = nextCol;

            steps = Math.max(steps, grid[nextRow][nextCol]);
        }
        return steps;
    }

    public static void main(String[] args) {
        // int[][] grid = {
        // { 0, 1, 2, 3, 4 },
        // { 24, 23, 22, 21, 5 },
        // { 12, 13, 14, 15, 16 },
        // { 11, 17, 18, 19, 20 },
        // { 10, 9, 8, 7, 6 }
        // };
        int[][] grid = { { 0, 2 }, { 1, 3 } };
        System.out.println(swimInWater(grid));
    }
}