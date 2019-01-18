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
        // Breadth first style.
        Queue<TreeNode> q = new LinkedList<>();
        
        if (root == null) {
            return 0;
        }
        
        q.add(root);
        int count = 1;
        while (true) {
            int currentLevelSize = q.size();
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode node = q.remove();
                if (node.left == null && node.right == null) {
                    // We encounter a leaf here.
                    return count;
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            count++;
        }
    }
}