# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self, root: Optional[TreeNode], d) -> int:
        if not root:
            return d
        h_l, h_r = d+1, d+1
        if root.left:
            h_l = self.dfs(root.left, h_l)
        if root.right:
            h_r = self.dfs(root.right, h_r)
        return max(h_l, h_r)

    def maxDepth(self, root: Optional[TreeNode]) -> int:
        return self.dfs(root, 0)
        