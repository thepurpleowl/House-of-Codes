class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        x_visited = set()
        for x in nums:
            if x in x_visited:
                return True
            else:
                x_visited.add(x)
        return False