class Solution:
    def traverse(self, grid, i, j):
        if (0 <= i < len(grid) and 0 <= j < len(grid[0]) and grid[i][j] == "1"):
            grid[i][j] = "0"
        
            self.traverse(grid, i, j-1)
            self.traverse(grid, i-1, j)
            self.traverse(grid, i+1, j)
            self.traverse(grid, i, j+1)

    def numIslands(self, grid: List[List[str]]) -> int:
        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "1":
                    self.traverse(grid, i, j)
                    count += 1

        return count
        