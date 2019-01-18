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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if (root == null) {
            return result;
        }
        
        q.add(root);
        boolean leftToRight = true;
        while (!q.isEmpty()) {
            // size is changing, so we have to store it first.
            int currentSize = q.size();
            List<Integer> levelVal = new LinkedList<>();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                if (leftToRight) {
                    levelVal.add(node.val);
                } else {
                    levelVal.add(0, node.val);
                }
            }
            result.add(levelVal);
            leftToRight = !leftToRight;
        }
        return result;
    }
}