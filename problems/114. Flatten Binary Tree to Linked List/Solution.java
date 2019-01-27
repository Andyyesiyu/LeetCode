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
    /*
        Time:   Balanced: O(NLogN)  logN layers. Each call derives two N/2 calls.
                    But each call's complexity is produced by while loop, which is O(N/2). So, N / 2 * logN.
                Spindly left: O(N^2) N layers. Each call's complexity is N-1
     */

    /*
        private TreeNode prev = null;

        public void flatten(TreeNode root) {
            if (root == null)
                return;
            flatten(root.right);
            flatten(root.left);
            root.right = prev;
            root.left = null;
            prev = root;
        }
    */
    public void flatten(TreeNode root) {
        flattenHelper(root);
    }
    
    private TreeNode flattenHelper(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return root;
        }
        TreeNode temp = root.right;
        root.right = flattenHelper(root.left);
        // Do not forget to make left tree null!!!.
        root.left = null;
        // Then traverse to the end of the right child.
        TreeNode ptr = root;
        while (ptr.right != null) {
            ptr = ptr.right;
        }
        ptr.right = flattenHelper(temp);
        return root;
    }
}