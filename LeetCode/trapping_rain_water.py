class Solution:
    def trap(self, height: List[int]) -> int:
        if len(height) <3:
            return 0

        left_high =[-1 for _ in height]

        max_left = -1
        for i in range(1, len(height) - 1):
            max_left = max(max_left, height[i-1])
            left_high[i] = max_left

        total = 0
        max_right = -1
        for i in range(len(height)-2, 0, -1):
            max_right = max(max_right, height[i+1])

            min_possible = min(max_right, left_high[i]) 
            if min_possible >= height[i]:
                total += min_possible - height[i]

        return total