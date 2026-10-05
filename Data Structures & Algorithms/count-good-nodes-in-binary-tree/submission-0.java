/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
        int count = 0;
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return helper(root, root.val);

    }
    private int helper(TreeNode root, int maxSoFar) {
        if (root == null) return 0;
        if (maxSoFar <= root.val) {
            count++;
            maxSoFar = root.val;
        }
        helper(root.left, maxSoFar);
        helper(root.right, maxSoFar);

        return count;
    }
}
