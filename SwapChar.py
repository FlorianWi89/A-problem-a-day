# Write a function that reverses a string. The input string is given as an array of characters s.

# O(N) Time and O(1) Space because in-place was required
def swapArray(s: list):
    for i in range((len(s)//s)):
        s[i], s[-1-i] = s[-1-i], s[i]
