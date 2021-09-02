# Task:Given an array of integers nums and an integer
# target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution,
# and you may not use the same element twice.
#
# You can return the answer in any order.

def twoSum(nums, target):
    indices = {}                               # create a dict to store the pairs
    for index, number in enumerate(nums):
        difference = target - number
        if difference in indices:              # check if the number we are currently looking for is already in the dict
            return [indices[difference, index]]
        else:
            indices[number] = index
