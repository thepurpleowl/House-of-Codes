# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def get_ancestor(self, head, a, b):
        if not head: 
            return None
        
        if head.val in [a,b]:
            return head
        
        found_left = self.get_ancestor(head.left, a, b)
        found_right = self.get_ancestor(head.right, a, b)
        # print(head.val, found_left, found_right)

        if found_left and found_right:
            return head
        elif (found_right or found_left):
            found_node = [found_left, found_right][found_right is not None]
            if head.val not in [a,b]:
                return found_node
            else:
                found_value = found_node.val
                if head.val == [a,b][found_value==a]:
                    return head
        return None

    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        return self.get_ancestor(root, p.val, q.val)
        