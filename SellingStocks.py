# You are given an array prices where prices[i] is the price of a given stock on the ith day.
# You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
# Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

# O(N^2) Time and O(1) Space
def naiveSolution(prices: list):
    n = len(prices)
    max = 0

    for i in prices:
        buy = prices[i]
        currentMax = 0
        j = i+1
        for j in prices:
            d = prices[j]-buy
            if d > currentMax:
                currentMax = d

        if currentMax > max:
            max = currentMax

    if max < 0:
        return 0
    return max


# O(N) Solution
def betterSolution(prices: list):
    n = len(prices)
    max = 0

    bought = prices[0]
    i = 1
    for i in prices:
        if prices[i] > bought and max < (prices[i]-bought):
            max = prices[i]-bought
        else:
            bought = prices[i]
    return max
