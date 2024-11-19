class Solution:
    def characterReplacement(self, str_a: str, k: int) -> int:
        char_count = {}
        s, i = 0, 0
        max_count  = 0
        max_length = 0
        while i < len(str_a):
            if str_a[i] in char_count:
                char_count[str_a[i]] += 1
            else:
                char_count[str_a[i]] = 1

            max_count = max(max_count, char_count[str_a[i]])
            while i - s + 1 - max_count > k:
                char_count[str_a[s]] -= 1
                s += 1

            max_length = max(max_length, i - s +1)
            i += 1
        
        return max_length
