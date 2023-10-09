package leetcodeProblames;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.

public class BuyAndSell_day1 {
	public static int maxProfit(int[] prices) {
		int profit = 0;
		int minSoFor = prices[0];
		for (int i = 0; i < prices.length; i++) {
			int p = prices[i] - minSoFor;
			if (p > profit) {
				profit = p;
			}
			// minSoFor=Math.min(minSoFor,prices[i]);
			if (prices[i] <= minSoFor) {
				minSoFor = prices[i];
			}

		}
		return profit;
	}

	public static void main(String[] args) {
		int[] prices = { 1, 2, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
}
