class Solution:
    def jump(self, nums: List[int]):
        steps = [2**31 for _ in nums]
        steps[0] = 0
        for i in range(1, len(nums)):
            for j in range(i):
                if nums[j] + j >= i: 
                    steps[i] = min(steps[i], steps[j]+1)
        return steps[-1]