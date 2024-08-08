class Solution:
	def twoSum(self, arr: list[int], s: int) -> list[int]:
		found_elements = {}
		for i, element in enumerate(arr):
			if s - element in found_elements:
				return [i, found_elements[s-element]]
			else:
			    found_elements[element] = i
