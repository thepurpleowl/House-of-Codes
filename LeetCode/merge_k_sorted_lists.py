# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getValues(self, lists):
        values = [(i, node.val) for i, node in enumerate(lists) if node]
        return values

    def getMin(self, node_values):
        return min(node_values, key= lambda x: x[1])[0]

    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        output = []
        
        while node_values:= self.getValues(lists):
            next_node_i = self.getMin(node_values)
            output.append(ListNode(val=lists[next_node_i].val,
                                   next=lists[next_node_i].next))
            lists[next_node_i] = lists[next_node_i].next
        
        for i in range(len(output)-1):
            output[i].next = output[i+1]

        return output[0] if output else None

# TODO: 
# 1. min heap approach: can be done inplace
# 2. merging two lists at a time: can be done inplace