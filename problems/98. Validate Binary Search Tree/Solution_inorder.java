/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        TreeNode prev = null; // Previous node in the order of inorder.

        while (true) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                if (stack.size() == 0) {
                    return true;
                }
                TreeNode cur = stack.pop();
                if (prev != null && prev.val >= cur.val) {
                    return false;
                } else {
                    prev = cur;
                    p = cur.right;
                }
            }
        }
    }
}