class Solution(object):
    def threeSum(self, nums):
        li = []
        for i in range(0, len(nums)-2):
            for j in range(i+1, len(nums)-1):
                for k in range(j+1, len(nums)):
                    if nums[i]+nums[j]+nums[k]==0:
                        zero=[nums[i],nums[j],nums[k]]    
                        if sorted(zero) not in li:
                            li.append(sorted(zero))
        return li