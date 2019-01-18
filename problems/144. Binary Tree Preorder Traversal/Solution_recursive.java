// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int x) { val = x; }
//  * }
//  */
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> l = new LinkedList<>();
//         preorderHelper(root, l);
//         return l;
//     }
    
//     private void preorderHelper(TreeNode root, List<Integer> l) {
//         if (root == null) {
//             return;
//         }
//         l.add(root.val);
//         preorderHelper(root.left, l);
//         preorderHelper(root.right, l);
//     }
// }

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        
        if (root == null) {
            return result; 
        }
        
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        
        return result;
    }
}