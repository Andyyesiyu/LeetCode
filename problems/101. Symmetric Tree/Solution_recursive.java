/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymTrees(root.left, root.right);
    }

    private boolean isSymTrees(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        } else if (a == null || b == null) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        } else {
            return isSymTrees(a.left, b.right) && isSymTrees(a.right, b.left);
        }
    }
}