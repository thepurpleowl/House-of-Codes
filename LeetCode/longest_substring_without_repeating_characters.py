class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left, right = 0, 0
        count = {}
        max_len = 0
        # max_ss = None
        while right < len(s):
            if s[right] in count:
                count[s[right]] += 1
                while left<= right and count[s[right]] > 1:
                    # if right-left >= max_len:
                    #     max_ss = s[left:right]
                    count[s[left]] -=1
                    left += 1
                right += 1
            else:
                count[s[right]] = 1
                right += 1
                # if right-left >= max_len:
                #     max_ss = s[left:right]

            max_len = max(max_len, right-left)
                    
        return max_len
            
        