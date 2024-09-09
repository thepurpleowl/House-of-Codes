from collections import defaultdict
class Solution:
    def totalFruit(self, fruits: List[int]) -> int:
        fruit_set = defaultdict(int)
        start = 0
        maxlen_subarray = -1
        for end in range(len(fruits)):
            fruit_set[fruits[end]] += 1

            while len(fruit_set) > 2:
                fruit_set[fruits[start]] -= 1
                if fruit_set[fruits[start]] == 0:
                    del fruit_set[fruits[start]]
                start += 1

            if len(fruit_set) <= 2:
                maxlen_subarray = max(maxlen_subarray, end-start + 1)

        return maxlen_subarray