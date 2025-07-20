package GooglePrep2025.DSA.Day_1.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(brutForce(prices));
        System.out.println(optimizeVersion(prices));

    }

    static int brutForce(int prices[]) {
        int maxReturn = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxReturn) {
                    maxReturn = profit;
                }
            }
        }
        return maxReturn;
    }

    static int optimizeVersion(int prices[]) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
