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
        Stack<TreeNode> s = new Stack();
        TreeNode current = root;
        List<Integer> l = new ArrayList();
        
        while (true) {
            if (current != null) {
                s.push(current);
                current = current.left;
            } else {
                if (s.isEmpty()) {
                    break;
                }
                current = s.pop();
                l.add(current.val);
                current = current.right;
            }
        }
        
        return l;
    }
}