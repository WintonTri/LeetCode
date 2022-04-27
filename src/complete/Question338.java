package complete;

// Valid -> 04/27/2022
public class Question338 {

    public static void main(String[] args) {
        countBits(2);
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (char c : Integer.toBinaryString(i).toCharArray())
                if (c == '1')
                    count++;
            ans[i] = count;
        }

        return ans;
    }

}
