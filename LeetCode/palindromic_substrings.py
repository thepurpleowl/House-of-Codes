class Solution:
    def palindromeCount(self, s: str, i: int, j: int):
        count = 0
        while(i>=0 and j<len(s) and s[i] == s[j]):
            count += 1
            i -= 1
            j += 1
        return count

    def countSubstrings(self, s: str) -> int:
        count = 0
        for i, c in enumerate(s):
            even_count = self.palindromeCount(s, i, i+1)
            odd_count = self.palindromeCount(s, i-1, i+1)
            count += even_count + odd_count + 1
        return count