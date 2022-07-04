package complete;

import java.util.Arrays;

// Attempt 1 Completed -> 06/17/2022
public class Question1833 {

    public int maxIceCream(int[] costs, int coins) {
        int res = 0;
        Arrays.sort(costs);
        for (int cost : costs) {
            if (cost > coins)
                return res;
            coins-=cost;
            res++;
        }

        return res;
    }

}
