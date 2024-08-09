class Solution:
    def minimumDeletions(self, s: str) -> int:
        # str_len = len(s)
        # mat = [[0 for i in range(str_len)] for j in range(str_len)]

        # for i in range(str_len-2, -1, -1):
        #     for j in range(i+1, str_len):
        #         mat[i][j] = min(mat[i][j-1] + int(s[j]=='a'),
        #                         mat[i+1][j] + int(s[i]=='b'),
        #                         mat[i+1][j-1] + int(s[i]=='b') + int(s[j]=='a'))

        # return mat[0][str_len-1]
        str_len = len(s)
        b_count = 0
        ans = 0
        for i in range(str_len):
            if s[i] == 'a':
                ans = min (ans+1, b_count)
            else:
                b_count += 1
        return ans
