# Given an integer n, return an array ans of length n + 1 such
# that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

# this is probably the most efficient solution i can come up with

# i think this is a DP approach since we use already calculated values instead of calculating them again
# the idea is to use bit shifting to get an already calculated index and then add 1 if the current number is odd

def countOnes(n: int):
    ones = [0]
    for i in range(1, n+1):
        ones.append(ones[i >> 1] + i % 2)
    return ones
