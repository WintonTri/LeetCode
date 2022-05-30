package complete;

// Attempt 1 Completed -> 04/29/2022
// Should redo this problem without converting the number to a string
// Note for second attempt -> reverse the number and then compare normal with reversed

// Attempt 2 Completed -> 05/29/2022
public class Question9 {

    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);

        while (s.length() > 1) {

            String left = Character.toString(s.charAt(0));
            String right = s.substring(s.length() - 1);

            if (!left.equals(right))
                return false;

            s = s.substring(1); // remove left char
            s = s.substring(0, s.length() - 1); // remove right char
        }

        return true;
    }


    public boolean isPalindrome2(int x) {
        if (x < 0) // Negative numbers are not palindrome
            return false;

        // Setting up the remaining code, checking this case
        if (x % 10 == 0 && x != 0)
            return false;

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10; // Add the last digit
            x /= 10; // Remove the last digit
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }

}
