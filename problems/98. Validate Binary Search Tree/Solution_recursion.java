/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long low, long up) {
        if (root == null) {
            return true;
        }
        if (root.val >= up || root.val <= low) {
            return false;
        }
        return helper(root.left, low, root.val) && helper(root.right, root.val, up);
    }
}