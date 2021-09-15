import numpy as np
from numpy.lib import math
# Given an integer array nums of length n where nums is a permutation of the numbers in the range [0..n-1]
# You should build a set s[k]= {nums[k],nums[nums[k]],...} subjected to the following rule:
# 1)The first element in s[k] starts with the section of the element nums[k] of index = k
# 2)The next element in s[k] should be nums[nums[k]] and then nums[nums[nums[k]]] and so on
# 3)We stop adding right before a duplicate element occurs in s[k]

# Return the length of the longest set s[k]

# Approach One: Brute force


def getCycle(i: int, nums: list):
    set = {}
    t = nums[i]

    while(t not in set):
        set.add(t)
        t = nums[t]

    return len(set)


def longestCycle(nums: list):
    longestCyc = 0
    for i in nums:
        t = getCycle(i, nums)
        if(t > longestCyc):
            longestCyc = t

    return longestCyc


firstSet = {5, 4, 0, 3, 1, 6, 3}

print(longestCycle(firstSet))


# Approach 2: Use an array for visited indices

def usingVisitedArray(nums: np.array):
    visited = np.full([len(nums)], False)
    longest = 0

    for x in np.nditer(nums):
        if(not visited[x]):
            start = nums[x]
            count = 0

            while (start != nums[x]):
                start = nums[start]
                count += 1
                visited[start] = True
                res = max(longest, count)

    return longest
