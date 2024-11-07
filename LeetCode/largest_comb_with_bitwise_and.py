class Solution:
    def largestCombination(self, candidates: List[int]) -> int:
        largest_set = 0
        for i in range(24):
            position_count = 0
            for n in candidates:
                if(n & (1 << i)):
                    position_count += 1
            largest_set = max(largest_set, position_count)

        return largest_set
