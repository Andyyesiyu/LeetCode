/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        }
        return helper(nums, 0, nums.length - 1);
    }

    private TreeNode helper(int[] nums, int lo, int hi) {
        if (lo == hi) {
            return new TreeNode(nums[lo]);
        } else if (lo > hi) {
            return null;
        } else {
            int mid = (lo + hi) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, lo, mid - 1);
            root.right = helper(nums, mid + 1, hi);
            return root;
        }
    }
}