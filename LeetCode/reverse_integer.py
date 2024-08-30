class Solution:
    def reverse(self, ip: int) -> int:
        if ip < 0:
            x = -1 * ip
        else:
            x = ip
        
        reverse = 0
        while x > 0:
            reverse *= 10
            reverse += x%10
            x //= 10

        if ip < 0:
            reverse *= -1

        if reverse > 2**31-1 or reverse < -2**31:
            return 0
        return reverse
