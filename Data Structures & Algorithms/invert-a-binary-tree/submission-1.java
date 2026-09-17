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


 /*
so we are returning a root which has the original binary tree but inverted
the base case is that if the node is null return null; No returning of anything else;
Alright now comes the third question so we basically need to change every level shift the right most to left most and vice versa and then all of the other ones.
So if I had right = 3 and left = 2 already figured out I would just need to shift them between eacch other. so while we are shifting the children of a root between each other we are also shifting it with everything else on so go down lets say you are at root 2 you go down and see root 4 and root 5. once you put your recursion over those since they have no children you will just come up to 2 now you have 2.left set that to right and 2.right set that to left. and then you go 


 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
}
