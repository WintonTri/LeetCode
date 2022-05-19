package complete;

// Attempt 1 Completed -> 05/19/2022
public class Question1689 {

    // Note the expected output is the largest single digit in the string.
    public int minPartitions(String n) {
        int largestNum = 0;
        for (char c : n.toCharArray()) {
            largestNum = Math.max(largestNum, c - '0');
            // largestNum = Math.max(largestNum, c - 48); // Using this would be faster, note char keycode for 0 is 48
        }
        return largestNum;
    }


}
