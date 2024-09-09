class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        if len(p) > len(s):
            return []
        indices = []

        p_dict = {}
        sw_dict = {}
        for i, pc in enumerate(p):
            p_dict[pc] = p_dict.get(pc, 0) + 1
            sw_dict[s[i]] = sw_dict.get(s[i], 0) + 1

        if sw_dict == p_dict:
            indices.append(0)

        for end in range(len(p), len(s)):
            start = end - len(p)
            sw_dict[s[end]] = sw_dict.get(s[end], 0) + 1
            sw_dict[s[start]] = sw_dict[s[start]] - 1
            if not sw_dict[s[start]]:
                del sw_dict[s[start]]
            if sw_dict == p_dict:
                indices.append(start+1)
        
        return indices