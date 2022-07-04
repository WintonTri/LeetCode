package complete;

// Attempt 1 Completed -> 07/04/2022
public class Question1475 {

    public int[] finalPrices(int[] prices) {
        if (prices.length <= 1)
            return prices;
        for (int i = 0; i < prices.length - 1; i++) {
            int cheaperPrice = 0;
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] >= prices[j]){
                    cheaperPrice = prices[j];
                    break;
                }
            }
            prices[i] -= cheaperPrice;
        }

        return prices;
    }

}
