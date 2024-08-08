class Solution:
    def hammingWeight(self, n: int) -> int:
        set_bits = 0
        while n:
            set_bits += n & 1
            n = n >> 1
        
        return set_bits
