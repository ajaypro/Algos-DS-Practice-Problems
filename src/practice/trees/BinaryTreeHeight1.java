package practice.trees;

import practice.util.Node;

/**
 * @author AjayDeepakSrinivasan on 22-08-2019, 15:36
 * @project Algos&Ds
 */
public class BinaryTreeHeight1 {

    Node root;

    public static void main(String[] args) {

        BinaryTreeHeight1 tree = new BinaryTreeHeight1();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));

    }

    int maxDepth(Node node) {

        if (node == null) {
            return 0;
        } else {

            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);

            if (leftDepth > rightDepth) {
                return leftDepth + 1;
            } else {
                return rightDepth + 1;
            }
        }


    }
}
