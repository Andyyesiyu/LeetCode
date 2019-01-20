/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

    // bool isBalanced (TreeNode *root) {
    //     if (root == NULL) return true;
        
    //     int left=depth(root->left);
    //     int right=depth(root->right);
        
    //     return abs(left - right) <= 1 && isBalanced(root->left) && isBalanced(root->right);
    // }

class Solution {
    /*  height is O(N)
        isBalanced = (T(N/2) + T(N/2)) * logN times => NlogN
    */ 

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (Math.abs(height(node.left) - height(node.right)) > 1) {
                return false;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return true;
    }
    
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}