package complete;

// Attempt 1 -> 05/25/2022
public class Question258 {

    public int addDigits(int num) {
        while (num >= 10) {
            num = getDigitSum(num);
        }

        return num;
    }

    public int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
