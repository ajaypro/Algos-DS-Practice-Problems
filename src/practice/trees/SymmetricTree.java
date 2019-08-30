package practice.trees;

import practice.util.Node;

/**
 * @author AjayDeepakSrinivasan on 22-08-2019, 11:18
 * @project Algos&Ds
 * <p>
 * Symmetric Tree (Mirror Image of itself),
 * check if subtrees of parent node of a tree are equal
 */
public class SymmetricTree {

    Node root;

    public static void main(String args[]) {
        SymmetricTree tree = new SymmetricTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(3);

        boolean result = tree.isSymmetric(tree.root);

        if (!result) System.out.println("Tree is not symmetrical");
        else {
            System.out.println("Tree is symmetrical");

        }
    }

    // returns true if tree is mirror of itself
    boolean isSymmetric(Node node) {
        return isMirror(root, root);
    }

    boolean isMirror(Node node1, Node node2) {

        // if both trees are empty, then they are mirror image
        if (node1 == null && node2 == null) {
            return true;
        }

        /**
         * Conditions for two subtrees to be mirror images, 3 conditions are must
         * 1 - Their root node's key must be same
         * 2 - left subtree of left tree and right subtree
         *      of right tree have to be mirror images.
         *  3 - right subtree of left tree and left subtree
         *      of right tree have to be mirror images .
         */

        if (node1 != null && node2 != null && node1.key == node2.key)
            return (isMirror(node1.left, node2.right)
                    && isMirror(node1.right, node2.left));
        return false;

    }
}
