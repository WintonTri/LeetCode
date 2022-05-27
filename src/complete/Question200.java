package complete;

// Attempt 1 Completed -> 05/27/2022
public class Question200 {

    public int numIslands(char[][] grid) {
        int counter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    removeIsland(grid, i, j);
                }
            }
        }
        return counter;
    }

    public void removeIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j >= grid[i].length || j < 0 || grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        // Check other directions w/ recursion
        removeIsland(grid, i + 1, j);
        removeIsland(grid, i, j + 1);
        removeIsland(grid, i - 1, j);
        removeIsland(grid, i, j - 1);
    }

}
