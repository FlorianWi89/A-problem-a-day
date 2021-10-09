def moveZeros(nums: list):
    blockSize = 0
    for i in nums:
        if(nums[i] == 0):
            blockSize += 1
        elif nums[i] > 0:
            temp = nums[i]
            nums[i] = 0
            nums[i-blockSize] = temp
