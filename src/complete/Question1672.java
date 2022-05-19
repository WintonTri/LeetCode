package complete;

// Attempt 1 Completed -> 05/19/2022
public class Question1672 {

    public int maximumWealth(int[][] accounts) {
        int mostWealth = 0; // Init
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth += i;
            }
            mostWealth = Math.max(wealth, mostWealth);
        }
        return mostWealth;
    }

}
