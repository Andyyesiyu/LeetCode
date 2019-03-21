/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int result = 0;

    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int temp) {
        if (root == null) {
            return;
        }
        temp = 10 * temp + root.val;
        if (root.left == null && root.right == null) {
            result += temp;
        }
        helper(root.left, temp);
        helper(root.right, temp);
    }
}