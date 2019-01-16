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
    public List<TreeNode> generateTrees(int n) {
        if (n < 1) {
            List<TreeNode> l = new ArrayList();
            return l;
        }
        return generateTreesHelper(1, n);
    }
    
    private List<TreeNode> generateTreesHelper(int lower, int upper) {
        List<TreeNode> l = new ArrayList();
        
        if (lower > upper) {
            l.add(null);
            return l;
        }
        
        if (lower == upper) {
            l.add(new TreeNode(lower));
            return l;
        }
        
        for (int root = lower; root <= upper; root++) {
            List<TreeNode> leftHand = generateTreesHelper(lower, root - 1);
            List<TreeNode> rightHand = generateTreesHelper(root + 1, upper);
            
            for (TreeNode leftTree : leftHand) {
                for (TreeNode rightTree : rightHand) {
                    TreeNode tree = new TreeNode(root);
                    tree.left = leftTree;
                    tree.right = rightTree;
                    l.add(tree);
                }
            }
        }
        
        return l;
    }
}