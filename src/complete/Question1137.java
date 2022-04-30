package complete;

// Attempt 1 Completed -> 04/29/2022
public class Question1137 {

    /* Notes
    0 <= n <= 37
    T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
     */
    public int tribonacci(int n) {
        // Load arr
        int[] arr = new int[38];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        int count = 3;
        while (count < 38) {
            arr[count] = arr[count - 3] + arr[count - 2] + arr[count - 1];
            count++;
        }

        return arr[n];
    }

    // This solution below is too slow, causes time limit exceeded on LeetCode
//        if (n == 0)
//            return 0;
//        if (n == 1 || n == 2)
//            return 1;
//        return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);

}
