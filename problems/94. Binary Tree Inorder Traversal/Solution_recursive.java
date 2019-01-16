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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList();
        inorderTraversalHelper(root, r);
        return r;
    }
    
    private void inorderTraversalHelper(TreeNode root, List<Integer> r) {
        if (root == null) {
            return;
        }
        inorderTraversalHelper(root.left, r);
        r.add(root.val);
        inorderTraversalHelper(root.right, r);
    }
}