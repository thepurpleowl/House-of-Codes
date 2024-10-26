class Solution:
    def bsearch(self, nums: List[int], l: int, r: int, target: int) -> int:
        print(l,r)
        if l > r:
            return -1

        mid = (l+r) // 2
        if nums[mid] == target:
            return mid

        if nums[mid] < target:
            return self.bsearch(nums, mid+1, r, target)
        else:
            return self.bsearch(nums, l, mid-1, target)

    def get_pivot(self, nums: List[int], l: int, r: int) -> int:
        mid = (l+r) // 2
        if nums[mid] >= nums[(mid-1)%len(nums)] and nums[mid] >= nums[(mid+1)%len(nums)]:
            return mid

        if nums[mid] < nums[l]:
            return self.get_pivot(nums, l, mid-1)
        else:
            return self.get_pivot(nums, mid+1, r)

    def search(self, nums: List[int], target: int) -> int: 
        pivot = self.get_pivot(nums, 0, len(nums)-1)
        if target >= nums[0]:
            return self.bsearch(nums, 0, pivot, target)
        else:
            return self.bsearch(nums, (pivot+1)%len(nums), len(nums)-1, target)
