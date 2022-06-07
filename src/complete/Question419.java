package complete;

// Attempt 1 Completed -> 06/06/2022
public class Question419 {

    public int countBattleships(char[][] board) {
        int res = 0;
        for (int i = 0; i < board.length; i++) { // Loop through every element in this graph
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') { // Part of the ship is found
                    res++;
                    sinkShip(i, j, board);
                }
            }
        }
        return res;
    }

    public void sinkShip(int i, int j, char[][] board) {
        // Checking the indices
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length)
            return;

        // No parts of the ship is found
        if (board[i][j] != 'X')
            return;

        // Setting this as checked / sunk
        board[i][j] = '.';

        // Check all directions around this position
        sinkShip(i - 1, j, board);
        sinkShip(i + 1, j, board);
        sinkShip(i, j - 1, board);
        sinkShip(i, j + 1, board);
    }

}
