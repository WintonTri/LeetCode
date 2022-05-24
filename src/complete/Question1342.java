package complete;

// Attempt 1 -> 05/24/2022
public class Question1342 {

    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            steps++;
            if (num % 2 == 0)
                num /= 2;
            else
                num--;
        }

        return steps;
    }

}
