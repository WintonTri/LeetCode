package inprogress;

// Attempt 1 Completed -> 04/29/2022
// Should redo this problem without converting the number to a string
// Note for second attempt -> reverse the number and then compare normal with reversed
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

}
