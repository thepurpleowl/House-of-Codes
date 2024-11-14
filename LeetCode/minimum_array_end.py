class Solution:
    def minEnd(self, n: int, x: int) -> int:
        result = x
        n -= 1  # Reducing n by 1 to exclude x from the iteration
        mask = 1

        # Step 1: Iterate while n > 0, using mask for bit positions
        while n > 0:
            # Step 2: If the corresponding bit in x is 0
            if (mask & x) == 0:
                # Set the bit in result based on least significant bit of n
                result |= (n & 1) * mask
                # Shift n right by 1 to process next bit
                n >>= 1
            # Shift mask left by 1 for next iteration
            mask <<= 1

        return result