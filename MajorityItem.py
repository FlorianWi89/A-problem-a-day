def majorityElement_hash(nums: list):
    num_len = len(nums)
    num_hash = {}
    for num in nums:
        num_hash[num] = num_hash.get(num, 0) + 1
        if num_hash[num] > num_len/2:
            return num


def majorityElement_moore(nums: list):
    majority_num = 0
    count = 0
    for num in nums:
        if count == 0:
            majority_num = num
        if majority_num != num:
            count -= 1
        else:
            count += 1
    return majority_num
