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



public class Codec {
    int index = 0;
    StringBuilder sb = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            sb.append("^");
            sb.append(",");
            return sb.toString();
        }

        sb.append(root.val);
        sb.append(",");

        serialize(root.left);
        serialize(root.right);

        String data = sb.toString();
        return data;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] tokens = data.split(",");
        index = 0;
        return helper(tokens);    
    }

    private TreeNode helper(String[] tokens) {
        if (tokens[index].equals("^")) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(tokens[index]));
        index++;

        root.left = helper(tokens);
        root.right = helper(tokens);

        return root;

        
    }
}
