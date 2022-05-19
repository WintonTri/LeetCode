package complete;

// Attempt 1 Completed -> 05/19/2022
public class Question1295 {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
//            boolean evenDigits = Integer.toString(num).length() % 2 == 0; // Too slow
            boolean evenDigits = isEvenDigitCount(num);
            if (evenDigits)
                count++;
        }
        return count;
    }

    private boolean isEvenDigitCount(int num) {
        if (num == 0)
            return true;

        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10; // remove a digit
        }
        return count % 2 == 0;
    }

}
