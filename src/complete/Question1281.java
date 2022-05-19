package complete;

import java.util.Stack;

// Attempt 1 & 2 Completed -> 05/19/2022
public class Question1281 {

    // First attempt, realized that I don't need to push it onto a stack
    public int subtractProductAndSum(int n) {
        if (n == 0) // Also don't need this, look closer at the constraints
            return 0;

        Stack<Integer> stack = new Stack<>();
        while (n != 0) {
            stack.push(n % 10);// Push the first digit
            n = n / 10;
        }

        // Start product at 1 since anything multiplied by 0 is still 0.
        int product = 1, sum = 0;
        for (int i : stack) {
            product *= i;
            sum += i;
        }

        return product - sum;
    }

    public int subtractProductAndSumSecondAttempt(int n) {
        int product = 1, sum = 0;
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;
            product *= digit;
            sum += digit;
        }
        return product - sum;
    }

}
