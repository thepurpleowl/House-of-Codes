class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        
        merged_intervals = []
        i = 0
        while i < len(intervals):
            j = i + 1
            max_end = intervals[i][1]
            while j < len(intervals) and intervals[j][0] <= max_end:
                max_end = max(max_end, intervals[j][1])
                j += 1
            merged_intervals.append([intervals[i][0], max_end])
            i = j
        
        return merged_intervals
        