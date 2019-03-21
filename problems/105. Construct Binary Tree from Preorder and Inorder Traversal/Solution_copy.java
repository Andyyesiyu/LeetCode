/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }

        // Base case.
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        int rootVal = preorder[0];
        int rootIn = -1;
        for (int i = 0; i < inorder.length; i++) {
            if (rootVal == inorder[i]) {
                rootIn = i;
            }
        }

        TreeNode result = new TreeNode(rootVal);
        int[] preLeft = Arrays.copyOfRange(preorder, 1, 1 + rootIn);
        int[] inLeft = Arrays.copyOfRange(inorder, 0, rootIn);
        int[] preRight = Arrays.copyOfRange(preorder, rootIn + 1, preorder.length);
        int[] inRight = Arrays.copyOfRange(inorder, rootIn + 1, inorder.length);
        result.left = buildTree(preLeft, inLeft);
        result.right = buildTree(preRight, inRight);
        return result;
    }
}