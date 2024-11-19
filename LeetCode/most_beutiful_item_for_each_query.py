class Solution:
    def get_search_key(self, sorted_item_keys, q):
        l, h = 0, len(sorted_item_keys) -1
        result = None
        while l <= h:
            mid = (l+h)//2
            if sorted_item_keys[mid] <= q:
                result = sorted_item_keys[mid]
                l = mid + 1
            else:
                h = mid - 1
        return result

    def maximumBeauty(self, items: List[List[int]], queries: List[int]) -> List[int]:
        sorted_items = sorted(items, key=lambda x: x[0])
        ans_dict = {}
        max_till_now = -1
        for it in sorted_items:
            max_till_now = max(max_till_now, it[1])
            ans_dict[it[0]] = max_till_now

        sorted_item_keys = [p for p in ans_dict]
        
        query_ans = []
        for q in queries:
            search_key = self.get_search_key(sorted_item_keys, q)
            query_ans.append(ans_dict[search_key] if search_key else 0)
        return query_ans