package sol_010_lca_in_bst;

import common.TreeNode;

public class LowestCommonAncestorInBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Making sure p is in LST and q will be in RST
        if(p.val > q.val) {
            return lowestCommonAncestor(root, q, p);
        }

        if(p.val <= root.val && q.val >= root.val)
            return root;

        if(p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return lowestCommonAncestor(root.right, p, q);
    }
}
