class Solution:
    def traverse(self, A, i, j, B, subisland):
        if (0 <= i < len(B) and 0 <= j < len(B[0]) and B[i][j] == 1):
            B[i][j] = 0
            subisland = subisland and (A[i][j] == 1)
        
            subisland = self.traverse(A, i, j-1, B, subisland)
            subisland = self.traverse(A, i-1, j, B, subisland)
            subisland = self.traverse(A, i+1, j, B, subisland)
            subisland = self.traverse(A, i, j+1, B, subisland)
            return subisland
        return subisland

        
    def countSubIslands(self, A: List[List[int]], B: List[List[int]]) -> int:
        count = 0
        for i in range(len(A)):
            for j in range(len(A[0])):
                if B[i][j] == 1:
                    subisland = self.traverse(A, i, j, B, True)
                    if subisland:
                        count += 1

        return count
        