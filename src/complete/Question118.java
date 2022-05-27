package complete;

import java.util.ArrayList;
import java.util.List;

public class Question118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0)
            return triangle;

        // Init first row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1); // Always 1 at the front

            List<Integer> previousRow = triangle.get(i - 1);
            for (int j = 1; j < i; j++) {
                newRow.add(previousRow.get(j - 1) + previousRow.get(j));
            }

            newRow.add(1); // Always 1 at the end
            triangle.add(newRow);
        }
        return triangle;
    }

}
