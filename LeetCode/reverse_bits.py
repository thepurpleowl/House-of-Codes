class Solution:
    def reverseBits(self, n: int) -> int:
        output = 0
        for i in range(32):
            output = output<<1
            output += (n&1)
            n >>= 1

        return output
