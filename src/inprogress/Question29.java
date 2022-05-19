package inprogress;

public class Question29 {

    // Divide without using multiplication, division, and mod operator.
    public int divide(int dividend, int divisor) {
        int count = 0;

        // Coverting everything to positive for now
        int dividendSign = dividend < 0 ? -1 : 1;
        int divisorSign = divisor < 0 ? -1 : 1;
        dividend = dividendSign * dividend; // oops
        divisor = divisorSign * divisor;

        while (dividend >= divisor) {
            dividend -= divisor;
            count++;
        }
        return count * dividendSign * divisorSign;
    }

}
