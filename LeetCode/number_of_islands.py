class Solution:
    def traverse(self, grid, i, j, visited):
        if (0 <= i < len(grid) and 0 <= j < len(grid[0]) and
                not visited[i][j] and grid[i][j] == "1"):
            visited[i][j] = True
        
            self.traverse(grid, i, j-1, visited)
            self.traverse(grid, i-1, j, visited)
            self.traverse(grid, i+1, j, visited)
            self.traverse(grid, i, j+1, visited)

        return visited

    def numIslands(self, grid: List[List[str]]) -> int:
        visited = [[False for _ in grid[0]] for _ in grid]

        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if visited[i][j]:
                    continue
                else:
                    if grid[i][j] == "1":
                        visited = self.traverse(grid, i, j, visited)
                        count += 1

        return count
        