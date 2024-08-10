class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        zeros = 0 
        product = 1
        for x in nums:
            if x == 0:
                zeros += 1
            else:
                product *= x

        output = []
        for x in nums:
            if not zeros:
                output.append(product//x)
            elif zeros > 1:
                output.append(0)
            else:
                if x == 0:
                    output.append(product)
                else:
                    output.append(0)

        return output