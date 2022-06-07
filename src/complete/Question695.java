package complete;

// Attempt 1 Completed -> 06/06/2022
public class Question695 {

    public int maxAreaOfIsland(int[][] grid) {
        int largest = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                // Check if this position contains part of an island
                if (grid[i][j] == 1)
                    largest = Math.max(largest, getIslandSize(i, j, grid));
            }
        }

        return largest;
    }

    // This will also remove the island
    private int getIslandSize(int i, int j, int[][] grid) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length)
            return 0;

        if (grid[i][j] != 1)
            return 0;

        int counter = 0;

        grid[i][j] = 0;
        counter++;

        counter += getIslandSize(i - 1, j, grid);
        counter += getIslandSize(i + 1, j, grid);
        counter += getIslandSize(i, j - 1, grid);
        counter += getIslandSize(i, j + 1, grid);

        return counter;
    }

}
