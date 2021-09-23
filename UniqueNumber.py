# Given a non-empty array of integers nums, every element appears twice except for one.
# Find that single one. You must implement a solution with a linear runtime complexity
# and use only constant extra space.


# using bitwise or (XOR) returns true if and only if 1 statement is true
def uniqueNum(array):
    answer = 0
    for i in array:
        answer ^= array[i]

    return answer
