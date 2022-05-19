package inprogress;

public class Question7 {

    // Note: Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
    // TODO learn more about the bit stuff
    public int reverse(int x) {
        int newNum = 0;
        int sign = x < 0 ? -1 : 1;
        x = x * sign;
        if (x > Integer.MAX_VALUE / 2)
            return 0;

        while (x != 0) {
            newNum = newNum * 10;

            int lastDigit = x % 10;
            x = x / 10; // Removing the last digit
            newNum += lastDigit;
        }

        return newNum * sign;
    }

}
