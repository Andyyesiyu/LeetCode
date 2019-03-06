/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int counter = 0;
        // No need to check if root is null because k is valid.

        Stack<TreeNode> stack = new Stack<>();
        TreeNode p = root;
        // Inorder Traversal.
        while (true) {
            if (p != null) {
                stack.push(p);
                p = p.left;
            } else {
                // Not possible to traverse over the end. Because k is valid.
                TreeNode current = stack.pop();
                counter++;
                if (counter == k) {
                    return current.val;
                }
                p = current.right;
            }
        }
    }
}