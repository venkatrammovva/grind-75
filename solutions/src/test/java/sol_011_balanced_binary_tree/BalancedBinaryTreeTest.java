package sol_011_balanced_binary_tree;

import common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {
    BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);

        TreeNode n1 = new TreeNode(9);
        root.left = n1;

        TreeNode n2= new TreeNode(20);
        n2.left = new TreeNode(15);
        n2.right = new TreeNode(7);
        root.right = n2;

        System.out.println(balancedBinaryTree.isBalanced(root));
    }
}