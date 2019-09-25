package practice.trees;

import practice.util.Node;

/**
 * @author AjayDeepakSrinivasan on 18-09-2019, 13:16
 * @project Algos&Ds
 * <p>
 * Write a function to print spiral order traversal of a tree
 * <p>
 * Steps :
 * Find height of tree this also helps in getting levels of tree
 * Recursion to help traverse down the tree
 */

public class LevelOrderTraversal {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(7);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(4);
        System.out.println("Spiral order traversal of Binary Tree is ");
        tree.printSpiral(tree.root);
    }

    static class Tree {
        Node root;

        void printSpiral(Node node) {

            int h = height(node);
            int level;
            boolean ltr = false;

            for (level = 1; level <= h; level++) {
                printGivenLevel(node, level, ltr);
                ltr = !ltr;
            }
        }

        void printGivenLevel(Node node, int level, boolean ltr) {

            if (node == null) {
                return;
            }

            if (level == 1)
                System.out.println("Tree is :" + node.key);
            else if (level > 1) {
                if (ltr) {
                    printGivenLevel(node.left, level - 1, ltr);
                    printGivenLevel(node.right, level - 1, ltr);
                } else {
                    printGivenLevel(node.right, level - 1, ltr);
                    printGivenLevel(node.left, level - 1, ltr);
                }
            }
        }


        int height(Node node) {

            if (node == null) {
                return 0;
            }

            int leftHeight = height(node.left);
            int rightHeight = height(node.right);

            if (leftHeight > rightHeight) {
                return (leftHeight + 1);
            } else {
                return (rightHeight + 1);
            }


        }
    }
}
