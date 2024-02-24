package sol_006_invert_binary_tree;


import common.TreeNode;

// https://leetcode.com/problems/invert-binary-tree/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode swp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(swp);
        return root;
    }
}
