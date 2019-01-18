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
        /**
         * The so-called iterative deepening.
         * I think.. it is also DFS?
         * time complexity: O(N) for bushy, O(N^2) for spindly.
         */
        List<List<Integer>> result = new LinkedList<>();
        int counter = 0;
        while (true) {
            List<Integer> levelNodes = new LinkedList<>();
            traverseLevel(root, counter, levelNodes);
            if (levelNodes.size() == 0) {
                return result;
            }
            result.add(0, levelNodes);
            counter++;
        }
    }
    
    private void traverseLevel(TreeNode root, int level, List<Integer> l) {
        if (root == null) {
            return;
        }
        if (level == 0) {
            l.add(root.val);
            return;
        } else {
            traverseLevel(root.left, level-1, l);
            traverseLevel(root.right, level-1, l);
        }
    }
}