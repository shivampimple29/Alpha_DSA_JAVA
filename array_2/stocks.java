package array_2;

public class stocks {
    public static void main(String args[]) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        int buy = Integer.MAX_VALUE;/* buy at min price */
        int buy_date = 0, sell_date = 0;
        int sell = Integer.MIN_VALUE; /* sell at max price */
        int i;

        for (i = 0; i < price.length; i++) {
            if (buy > price[i]) {
                buy = price[i];
                buy_date = i + 1;
            }
        }
        for (int j = buy_date - 1; j < price.length; j++) {
            if (sell < price[j]) {
                sell = price[j];
                sell_date = j + 1;
            }
        }
        System.out.println("Buy a stock on day " + buy_date + " at price " + buy);
        System.out.println("Sell a stock on day " + sell_date + " at price " + sell);
        int profit = sell - buy;
        if (profit <= 0) {
            System.out.println("Profit is zero.");
        } else {
            System.out.println("Maximum Profit is " + profit + " units.");
        }

    }
}
