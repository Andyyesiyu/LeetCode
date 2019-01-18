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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if (root == null) {
            return result;
        }
        q.add(root);
        while (q.size() != 0) {
            int currentSize = q.size();
            List<Integer> levelList = new LinkedList<>();
            for (int i = 0; i < currentSize; i++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
                levelList.add(node.val);
            }
            result.add(0, levelList);
        }
        return result;
    }
}