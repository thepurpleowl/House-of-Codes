class Solution:
    def dfs(self, isConnected, visited, row):
        if visited[row]:
            return
        visited[row] = True
        
        for col in range(len(isConnected)):
            if isConnected[row][col] == 1 and not visited[col]:
                self.dfs(isConnected, visited, col)

    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        n = len(isConnected)
        visited = [False for _ in range(n)]
        provinces = 0

        for row in range(len(isConnected)):
            if visited[row]:
                continue
            self.dfs(isConnected, visited, row)
            provinces += 1

        return provinces
        