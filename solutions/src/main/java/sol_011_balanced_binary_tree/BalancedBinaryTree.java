package sol_011_balanced_binary_tree;

import common.TreeNode;

//https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
    private record Answer(int height, boolean balanced) {}

    public boolean isBalanced(TreeNode root) {
        return iterate(root).balanced();
    }

    private Answer iterate(TreeNode root) {
        if(root == null)
            return new Answer(0, true);

        Answer leftAnswer = iterate(root.left);
        Answer rightAnswer = iterate(root.right);

        if(leftAnswer.balanced()
                && rightAnswer.balanced()
                && Math.abs(leftAnswer.height() - rightAnswer.height()) <= 1
        ) {
            return new Answer(Math.max(leftAnswer.height(), rightAnswer.height()) + 1, true);
        }

        return new Answer(Math.max(leftAnswer.height(), rightAnswer.height()) + 1, false);

    }
}
