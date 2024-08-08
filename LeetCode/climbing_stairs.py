class Solution:
    way_count = {1: 1, 2: 2}
    def climbStairs(self, n: int) -> int:
        if n <= 2:
            return Solution.way_count[n]
        else:
            if n not in Solution.way_count:
                Solution.way_count[n] = self.climbStairs(n-1) + self.climbStairs(n-2)

            return Solution.way_count[n]
