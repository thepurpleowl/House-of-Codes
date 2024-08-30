# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def postorder(self, root: Optional[TreeNode], output: List[int]) -> List[int]:
        if not root:
            return output
        output = self.postorder(root.left, output)
        output = self.postorder(root.right, output)
        output.append(root.val)

        return output

    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        output = []
        self.postorder(root, output)
        return output
        