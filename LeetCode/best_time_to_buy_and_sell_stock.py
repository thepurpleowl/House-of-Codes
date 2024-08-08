class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        max_profit = float('-inf')
        max_selling_price = prices[-1]
        for i in range(len(prices)-2, -1, -1):
            max_selling_price = max(max_selling_price, prices[i])

            if max_selling_price - prices[i] > max_profit:
                max_profit = max_selling_price - prices[i]

        return 0 if max_profit < 0 else max_profit
