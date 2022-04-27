package complete;

// Valid -> 04/27/2022
// Note: Discrete math class had a similar problem
public class Question70 {

    /*
    1 -> 1
    2 -> 2 (+1)
    3 -> 3 (+1)
    4 -> 5 (+2)
    5 -> 8 (+3)
    6 -> 13 (+5)
    7 -> 21 (+8)
    8 -> 34 (+13)
    9 -> 55 (+21)
    10 -> 89 (+34)
     */
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int first = 1, second = 2;

        // first will change to second value
        // second will change to second + first value
        for (int i = 3; i < n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }

        return first + second;
    }

}
