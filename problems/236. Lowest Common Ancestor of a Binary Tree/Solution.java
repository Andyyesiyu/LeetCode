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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // This function will be called at most logN times.
        // Thus, time is NlogN
        if (root == null) {
            return null;
        }
        boolean leftHasBothNodes = hasBothNodes(root.left, p, q);
        boolean rightHasBothNodes = hasBothNodes(root.right, p, q);
        
        if (leftHasBothNodes) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (rightHasBothNodes) {
            return lowestCommonAncestor(root.right, p, q);
        }
        
        return root;
    }
    
    private boolean hasBothNodes(TreeNode root, TreeNode p, TreeNode q) {
        // Time: O(N)
        if (root == null) {
            return false;
        }
        // Here we use BFS.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.val == p.val || node.val == q.val) {
                count++;
                if (count == 2) {
                    return true;
                }
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return false;
    }
}