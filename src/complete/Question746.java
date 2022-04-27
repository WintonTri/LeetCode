package complete;

// Valid -> 04/27/2022
// Somewhat similar to question 70
public class Question746 {

    public int minCostClimbingStairs(int[] cost) {
        int first = 0, second = 0;
        for (int i : cost) {
            int temp = i + Math.min(first, second);
            first = second;
            second = temp;
        }
        return Math.min(first, second);
    }

}
