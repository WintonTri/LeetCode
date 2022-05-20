package inprogress;

public class Question367 {

    // This works, but is too slow
    public boolean isPerfectSquare(int num) {
        int factor = 0;
        while (factor * factor < num) {
            factor++;
        }

        return factor * factor == num;
    }

}
