package complete;

// Attempt 1 -> 05/23/2022
public class Question1572 {

    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        if (length == 1)
            return mat[0][0];

        int total = 0;

        // Determining what to do with the middle number (If any)
        // This would count the middle number once since -1 + 2 = 1
        boolean containsMiddleNumber = length % 2 == 1;
        if (containsMiddleNumber) {
            int middleIndex = length / 2;
            int middleNumber = mat[middleIndex][middleIndex];
            total -= middleNumber;
        }

        for (int i = 0; i < length; i++) {
            total += mat[i][i];
            total += mat[length - 1 - i][i];
        }

        return total;
    }

}
