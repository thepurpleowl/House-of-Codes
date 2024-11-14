class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        dp = [[0 for _ in row] for row in matrix]
        for j in range(len(matrix[0])):
            if matrix[0][j] == 1:
                dp[0][j] = 1
        for i in range(len(matrix)):
            if matrix[i][0] == 1:
                dp[i][0] = 1
        
        for i in range(1, len(matrix)):
            for j in range(1, len(matrix[0])):
                if matrix[i][j] == 1:
                    dp[i][j] = min(dp[i-1][j], dp[i][j-1], dp[i-1][j-1]) + 1
        # print(dp)
        return sum(dp[i][j] for i in range(len(matrix)) for j in range(len(matrix[0])))
