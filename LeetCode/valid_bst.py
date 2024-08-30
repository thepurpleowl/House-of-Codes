# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def check_validity(self, root, low, high):
        if root is None:
            return True
        # print(root.val, low, high)
        if root.val <= low or root.val >= high:
            return False

        l_valid = self.check_validity(root.left, low, root.val)
        r_valid = self.check_validity(root.right, root.val, high)

        return l_valid and r_valid

    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.check_validity(root, -float("inf"), float("inf"))
