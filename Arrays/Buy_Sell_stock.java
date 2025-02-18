public class Buy_Sell_stock {
    public static int buyandSellProfit(int Prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < Prices.length; i++) {
            if (buyPrice < Prices[i]) {
                int profit = Prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = Prices[i];

            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int Prices[] = { 7, 1, 5, 3, 6, 4 };
        int profit = buyandSellProfit(Prices);
        System.out.println("The max profit is :" + profit);
    }
}
