package inprogress;

// Attempt 1 Completed -> 06/11/2022
public class Question121 {

    // Note: Will only buy and sell once at most
    public int maxProfit(int[] prices) {
        int currentLowestPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            // Updating lower price
            if (price < currentLowestPrice) {
                currentLowestPrice = price;
            }

            // Determining / updating profit
            int potentialProfit = price - currentLowestPrice;
            if (potentialProfit > profit)
                profit = potentialProfit;
        }

        return profit;
    }

}
