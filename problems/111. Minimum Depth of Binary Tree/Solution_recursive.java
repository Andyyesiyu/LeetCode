/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        // Recursive Style.
        if (root == null) {
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        // The tricky part is: if either side is null, that is not even a leaf.
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}