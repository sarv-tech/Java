// Buy & Sell Stock


public class BuySell {

    public static int maxProfit(int Prices[]) {
        
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < Prices.length; i++) {

            if(buyingPrice < Prices[i]) {   // profit

                int profit = Prices[i] - buyingPrice;    // today's profit
                maxProfit = Math.max(maxProfit, profit);

            } else {

                buyingPrice = Prices[i];

            }
        }

        return maxProfit;

    }
    public static void main(String[] args) {

        int Prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(Prices));
        
    }
}

// Time complexity: O(n) ---> One loop is applied which is running till n 