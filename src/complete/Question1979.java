package complete;

// Valid -> 04/27/2022
// Note: need to study more to completely understand the gcd function
public class Question1979 {


    public int findGCD(int[] nums) {
        if (nums.length == 0)
            return 1; // 1 is a denominator of every number.

        int smallestNum = nums[0], largestNum = nums[0];

        // Sets the smallest & largest numbers
        for (int i : nums) {
            if (i < smallestNum)
                smallestNum = i;
            if (i > largestNum)
                largestNum = i;
        }

        return getGcd(smallestNum, largestNum);
    }

    // Found the function on: https://stackoverflow.com/questions/4009198/java-get-greatest-common-divisor
    // This function will keep using recursion to find the gcd.
    // Stop condition: a % b == 0, returns a
    // Else, Use recursion to ... TODO understand the rest
    public int getGcd(int a, int b) {
        return b == 0 ? a : getGcd(b, a % b);
    }

}
