# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def constructFromPrePost(self, preorder, postorder):
        """
        :type preorder: List[int]
        :type postorder: List[int]
        :rtype: Optional[TreeNode]
        """
        if not preorder:
            return None
        root=TreeNode(preorder[0])
        
        if len(preorder) == 1:
            return root

        ix=postorder.index(preorder[1])+1
    
        root.left=self.constructFromPrePost(preorder[1:ix+1], postorder[:ix])
        root.right=self.constructFromPrePost(preorder[ix+1:], postorder[ix:-1])
        return root
        
        